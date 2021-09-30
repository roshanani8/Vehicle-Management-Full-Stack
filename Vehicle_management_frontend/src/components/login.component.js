import React, { Component } from "react";
import axios from "axios";
import { toast, ToastContainer } from "react-toastify";
import {Route, Link,useHistory } from "react-router-dom";
import { Redirect } from 'react-router-dom';
import AddVehicle from "./AddVehicle";

// class Login extends React.Component{

//     constructor(props){
//         super(props);
//         this.state={
//             email:"",
//             password:""
//         };
//     }


//     render() {

  
//         return (
//             <form >
//                 <h3>Log in</h3>

//                 <div className="form-group">
//                     <label>Email</label>
//                     <input type="email" className="form-control" placeholder="Enter email" value={this.state.email} 
//                      onChange={(event) => {
//                         this.setState({ email: event.target.value })
//                     }
//                     }
//                     className="form-control"
//                     id="email"/>
//                 </div>

//                 <div className="form-group">
//                     <label>Password</label>
//                     <input type="password" className="form-control" placeholder="Enter password" 
//                     value={this.state.password}
//                     onChange={(event) => {
//                         this.setState({ password: event.target.value })
//                     }
//                     }
//                     className="form-control" id="pwd"
//                     />
//                 </div>

//                 <button  className="btn btn-dark btn-lg btn-block"
                
//                 onClick={()=>{

//                     axios.post("http://localhost:8080/api/v2/login", {
//                         password: this.state.password,
//                         email: this.state.email
//                     }).then((response) => {
//                         console.log(response.data)
                        
//                         var fields = response.data.split(' ');
//                         console.log("check success :" + fields[0])
//                         console.log("check type Id :" + fields[1])
//                         // this.props.history.push('/listVehicles');
//                         if (fields[0] == "success" && fields[1] == "ADMIN_ROLE")
//                         {
//                             this.props.history.push('addVehicle');
//                             toast("u r at admin UI")
//                         }
//                       else
//                        this.props.history.push('/listVehicles');
//                        toast("Invalid User,Please login with correct credentials!")
//                        console.log(fields[0])
                     
//                     })



//                 }}
                
//                 >Sign in</button>
               
                
                
//             </form>
            
//         );
//     }
    
    
// }

// export default Login;


export default class Login extends Component {


    handleSubmit=(e)=>{
        e.preventDefault();
      
    
    
    
        const data={
            email:this.email,
            password:this.password
        }
    
        axios.post("http://localhost:8080/api/v2/login",data)
        .then(ressponse=>{
            console.log(ressponse)
            this.props.history.push('addVehicle');
            toast("User Logged in Succssfully!!")
            
       
            
            
        })
        .catch(error=>{
            console.log(error)
            toast("Invalid User!!")
        })
    }
    
        render() {
    
      
    
        
    
    
            return (
                <form onSubmit={this.handleSubmit}>
                    <h3>Log in</h3>
    
                    <div className="form-group">
                        <label>Email</label>
                        <input type="email" className="form-control" placeholder="Enter email" onChange={e=>this.email =e.target.value} />
                    </div>
    
                    <div className="form-group">
                        <label>Password</label>
                        <input type="password" className="form-control" placeholder="Enter password" onChange={e=>this.password =e.target.value} />
                    </div>
    
                    <button type="submit" className="btn btn-dark btn-lg btn-block">Sign in</button>
                    <p className="forgot-password text-right">
                        Forgot <a href="#">password?</a>
                    </p>
                    
                    
                </form>
                
            );
        }
        
        
    }
