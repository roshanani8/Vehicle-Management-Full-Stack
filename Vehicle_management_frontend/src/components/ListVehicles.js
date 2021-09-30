import React from "react";
import axios from "axios";
import { render } from "react-dom";
import { Component } from "react";


export default class ListVehicles extends Component{
   
   constructor(props){
       super(props)
       this.state={
           vehicles:[],
           user:[]
           
       }
   }
   componentDidMount(){
       axios.get("http://localhost:8080/api/v1/vehicles")
       
   .then(response=>{
       console.log(response);
       this.setState({vehicles:response.data})
  
       console.log(this.state.user)
   })
   .catch(error=>{
       console.log(error);
   })
    }
    render(){
        const{vehicles} = this.state
        return(
            <div>
                List{
                    vehicles.length?
                    vehicles.map(vehicles=><div key={vehicles.vehicleId} > 
 

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Plate Number</th>
      <th scope="col">Model</th>
      <th scope="col">Year Of Manufacture</th>
      
      
    </tr>
  </thead>
  <tbody>
  
    <tr>
      <th scope="row"style={{textAlign:"center"}}>{vehicles.plateNUmber}</th>
      <td>{vehicles.model}</td>
      <td>{vehicles.yearOfManufacture}</td>
     
     
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


