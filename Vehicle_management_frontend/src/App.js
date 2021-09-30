import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import { BrowserRouter as Router, Switch, Route,Link} from "react-router-dom";
// import { Card } from 'react-bootstrap';

import { ToastContainer, toast } from 'react-toastify';
import Login from "./components/login.component";
import SignUp from "./components/signup.component";
import AddVehicle from './components/AddVehicle';
import ListVehicles from './components/ListVehicles';
import ListUser from './components/ListUser';
import AddjobSheet from './components/AddJobsheet';
import ListJob from './components/ListJobSheet';
import Welcome from './components/Home';

function App() {
   return (
 <Router>
    <div className="App">
  
<ToastContainer/>
      <nav className="navbar navbar-expand-lg navbar-dark fixed-top"  >
      <img className="image1" src="./images/logo.png" />
      
        <div className="container"> 

          <Link className="navbar-brand"  to={"/"}>Vehicle Management</Link>
          
          <div className="collapse navbar-collapse" id="navbarTogglerDemo02">
            <ul className="navbar-nav ml-auto">
              <li className="nav-item">
                
              
             
                
                <Link className="nav-link" to={"/addVehicle"}>Add Vehicle</Link>
                {/* <Link className="nav-link" to={"/addJobsheet"}>Add jobsheet</Link> */}
                <Link className="nav-link" to={"/listVehicles"}>List Of Vehicles</Link>
                <Link className="nav-link" to={"/listUsers"}>List Of Users</Link>
                <Link className="nav-link" to={"/ListJobSheet"}>List Of Jobs</Link>
             </li>
            </ul>
          </div>
        </div>
      </nav>
      {/* <div><img className="image" src="./images/121.png"/></div> */}
      <div className="outer">
 
        <div className="inner">
          <Switch>
            <Route exact path='/' component={Welcome} />
            <Route path="/signIn" component={Login} />
            <Route path="/signUp" component={SignUp} />
            <Route path="/addJobsheet" component={AddjobSheet} />
            <Route path="/addVehicle" component={AddVehicle} />
            <Route path="/listVehicles" component={ListVehicles} />
            <Route path="/listUsers" component={ListUser} />
            <Route path="/ListJobSheet" component={ListJob} />
            {/* <Route path="/listVehicles">
                                <ListVehicles />
                            </Route> */}
            
            
          </Switch>
        </div>
        
      </div>
      
    </div></Router>
    

  );
}

export default App;


/*

*/