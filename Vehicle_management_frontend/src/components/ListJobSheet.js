import React from "react";
import axios from "axios";
import { render } from "react-dom";
import { Component } from "react";


export default class ListJob extends Component{
   
   constructor(props){
       super(props)
       this.state={
           job_sheet:[]
           
       }
   }
   componentDidMount(){
       axios.get("http://localhost:8080/api/v1/jobs")
       
   .then(response=>{
       console.log(response);
       this.setState({job_sheet:response.data})
   })
   .catch(error=>{
       console.log(error);
   })
    }
    render(){
        const{job_sheet} = this.state
        return(
            <div className="center">
                job_sheet List{
                    job_sheet.length?
                    job_sheet.map(job_sheet=><div key={job_sheet.id}> 
 

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Description</th>
      <th scope="col">Cost</th>
      <th scope="col">Repair Date</th>
      <th scope="col">Repair Type</th>
      <th scope='col'>Status</th>
      
    </tr>
  </thead>
  <tbody>
  
    <tr>
      <th scope="row">{job_sheet.description}</th>
      <td>{job_sheet.cost}</td>
      <td>{job_sheet.repairDate}</td>
      <td>{job_sheet.repairType}</td>
      <td>{job_sheet.status}</td>
     
    </tr>
    
  </tbody>
</table>
                      </div>):
                    null
                }
            </div>
        )
    }
}
