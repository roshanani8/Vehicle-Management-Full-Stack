import SignUp from "./signup.component";
import Login from "./login.component";
import React from "react";
import { Link } from "react-router-dom";


export default class Welcome extends React.Component {

	render() {
       
		return (
<div>


<img className="image" src="./images/121.png"/>
           <Link padding="10px"  to={"/signIn"}>Sign in</Link>
           <hr/>
           <br/>
           <Link   to={"/signUp"}>Sign up</Link>


{/* <table>

    <tr> 
        <td> <Link  to={"/signIn"}>Sign in</Link></td>
    </tr>
    <tr>
        <td>
        <Link className="nav-link" to={"/signUp"}>Sign up</Link>
        </td>
    </tr>
</table> */}

</div>
	);
  }
}

