import React, { Component } from "react";
import axios from "axios";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
export default class AddjobSheet extends Component {
   constructor(props){
       super(props)

       this.state={
          
        repairDate:'',
        status:'',
        repairType:'',
        cost:'',
        description:''
           
       }
   }
   
   ChangeHandler=(e)=>{
      this.setState({[e.target.name]:e.target.value})
      

   }

   submitHandler=(e)=>{
         e.preventDefault()
         console.log(this.state)

         axios.post("http://localhost:8080/api/v1/jobs",this.state)
         .then(response =>{
             console.log(response)
             toast("Jobsheet Added Successfully!!!");
         })
         .catch(error=>{
             console.log(error)
             toast("Error in Network!");
         })
   }
  
    render() {
      const{ repairDate,status,repairType,cost,description}=this.state 
        return (
            <form onSubmit={this.submitHandler}>
                <h2>Add Job-Sheet</h2>
               
                
                <div className="form-group">
                    <label>repairDate</label>
                    <input type="date" name="repairDate" className="form-control" placeholder="Plate Number"value={repairDate} onChange={this.ChangeHandler}/>
                </div>
{/* 
                            <div class="form-group">
                                <label >Status</label>
                                <select class="form-control" name="status" value={this.state.value} onChange={this.ChangeHandler}>
                                    <option selected disabled>Select...</option>
                                    <option value="PENDING">Pending</option>
                                    <option value="COMPLETED">Completed</option>
                                    <option value="IN_PROGRESS">In Progress</option>
                                </select>
                            </div> */}
               
               
                <div className="form-group">
                    <label>status</label>
                    <input type="text" name="status" className="form-control" placeholder="PENDING/COMPLETED/IN_PROGRESS" value={status} onChange={this.ChangeHandler}/>
                </div>

                <div className="form-group">
                    <label>repairType</label>
                    <input type="text" name="repairType" className="form-control" placeholder="MINOR_REPAIR/MAJOR_REPAIR" value={repairType} onChange={this.ChangeHandler} />
                </div>
               
                            {/* <div class="form-group">
                                <label >Repair Type</label>
                                <select class="form-control" name="repairType" value={this.state.value} onChange={this.ChangeHandler}>
                                    <option selected disabled>Select...</option>
                                    <option value="MINOR_REPAIR">Minor Repair</option>
                                    <option value="MAJOR_REPAIR">Major Repair</option>
                                </select>
                            </div> */}
                <div className="form-group">
                    <label>cost</label>
                    <input type="text" name="cost" className="form-control" placeholder="Enter cost" value={cost} onChange={this.ChangeHandler}/>
                </div>

                <div className="form-group">
                    <label>description</label>
                    <input type="text" name="description" className="form-control" placeholder="Enter description" value={description} onChange={this.ChangeHandler}/>
                </div>

               

                <button type="submit" className="btn btn-dark btn-lg btn-block">Add Job Sheet</button>
               
            </form>
        );
    }
}