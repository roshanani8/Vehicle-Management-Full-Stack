import React from "react";
import axios from "axios";
import { render } from "react-dom";
import { Component } from "react";


export default class ListUser extends Component{
   
   constructor(props){
       super(props)
       this.state={
           user:[]
           
       }
   }
   componentDidMount(){
       axios.get("http://localhost:8080/api/v1/users")
       
   .then(response=>{
       console.log(response);
       this.setState({user:response.data})
   })
   .catch(error=>{
       console.log(error);
   })
    }
    render(){
        const{user} = this.state
        return(
            <div className="center">
                User List{
                    user.length?
                    user.map(user=><div key={user.id}> 
 

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">First Nmae</th>
      <th scope="col">Last Name</th>
      <th scope="col">Address</th>
      <th scope='col'>Email-Id</th>
      
    </tr>
  </thead>
  <tbody>
  
    <tr>
      <th scope="row">{user.firstName}</th>
      <td>{user.lastName}</td>
      <td>{user.address}</td>
      <td>{user.email}</td>
     
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
