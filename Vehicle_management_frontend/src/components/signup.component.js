import React, { Component } from "react";
import axios from "axios";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import Login from "./login.component";
import { Route } from "react-router";
export default class SignUp extends Component
 {
   constructor(props){
       super(props)

       this.state={
           afm:'',
           firstName:'',
           lastName:'',
           address:'',
           email:'',
           password:'',
           roleType:'SIMPLE_USER_ROLE'
       }
   }
   
   ChangeHandler=(e)=>{
       this.setState({[e.target.name]:e.target.value})
   }

   submitHandler=(e)=>{
         e.preventDefault()
         console.log(this.state)

         axios.post("http://localhost:8080/api/v1/users",this.state)
         .then(response =>{
             console.log(response)
             toast("User Added Successfully!!!");

         })
         .catch(error=>{
             console.log(error)
             toast("Error in Network!");
         })
   }
  
   
   
    render() {
       const{ afm,firstName,lastName,address,email,password}=this.state 
        return (
            <form onSubmit={this.submitHandler}>
                <h3>Register</h3>
                <div className="form-group">
                    <label>Contact Number</label>
                    <input type="text" name="afm" size="10" className="form-control" placeholder="Contact no." value={afm} onChange={this.ChangeHandler}/>
                </div>
                
                <div className="form-group">
                    <label>First name</label>
                    <input type="text" name="firstName" className="form-control" placeholder="First name"value={firstName} onChange={this.ChangeHandler}/>
                </div>

                <div className="form-group">
                    <label>Last name</label>
                    <input type="text" name="lastName" className="form-control" placeholder="Last name" value={lastName} onChange={this.ChangeHandler}/>
                </div>

                <div className="form-group">
                    <label>Address</label>
                    <input type="text" name="address" className="form-control" placeholder="Address" value={address} onChange={this.ChangeHandler} />
                </div>

                <div className="form-group">
                    <label>Email</label>
                    <input type="email" pattern=".+@gmail\.com"  required name="email" className="form-control" placeholder="Enter email" value={email} onChange={this.ChangeHandler}/>
                </div>

                <div className="form-group">
                    <label>Password</label>
                    <input type="password" 
                    pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" name="password" className="form-control" placeholder="Enter password" required="required" value={password} onChange={this.ChangeHandler}/>
                </div>

                <button type="submit"  className="btn btn-dark btn-lg btn-block">Register</button>
                <p className="forgot-password text-right">
                    Already registered <a href="#">log in?</a>
                </p>
            </form>
        );
    }
}
// export default () => (
//     <div>
//        <Router>
//             <Route component={Login} />
//        </Router>
//    </div>
//  );