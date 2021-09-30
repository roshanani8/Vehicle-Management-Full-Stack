import React, { Component } from "react";
import axios from "axios";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
export default class AddVehicle extends Component {
   constructor(props){
       super(props)

       this.state={
          
           plateNUmber:'',
           model:'',
           yearOfManufacture:'',
           color:''
           
       }
   }
   
   ChangeHandler=(e)=>{
       this.setState({[e.target.name]:e.target.value})
   }

   submitHandler=(e)=>{
         e.preventDefault()
         console.log(this.state)

         axios.post("http://localhost:8080/api/v1/vehicles",this.state)
         .then(response =>{
             console.log(response)
             this.props.history.push('/');
             toast("Vehicle Added Successfully!!!");
         })
         .catch(error=>{
             console.log(error)
             toast("Error in Network!");
         })
   }
  
   
   
    render() {
       const{ plateNUmber,model,yearOfManufacture,color}=this.state 
        return (
            <form onSubmit={this.submitHandler}>
                <h3>Add Vehicle</h3>
               
                
                <div className="form-group">
                    <label>Plate Number</label>
                    <input type="text" name="plateNUmber" className="form-control" placeholder="Plate Number"value={plateNUmber} onChange={this.ChangeHandler}/>
                </div>

                <div className="form-group">
                    <label>Model</label>
                    <input type="text" name="model" className="form-control" placeholder="Vehicle Model" value={model} onChange={this.ChangeHandler}/>
                </div>

                <div className="form-group">
                    <label>year Of Manufacture</label>
                    <input type="text" name="yearOfManufacture" className="form-control" placeholder="year Of Manufacture" value={yearOfManufacture} onChange={this.ChangeHandler} />
                </div>

                <div className="form-group">
                    <label>color</label>
                    <input type="color" name="color" className="form-control" placeholder="Enter color" value={color} onChange={this.ChangeHandler}/>
                </div>

               

                <button type="submit" className="btn btn-dark btn-lg btn-block">Add Vehicle</button>
               
            </form>
        );
    }
}