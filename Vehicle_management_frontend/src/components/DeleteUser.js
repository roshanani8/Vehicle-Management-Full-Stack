import { useState,useEffect } from "react";
import axios from "axios";
import { toast, ToastContainer } from "react-toastify";
import { useHistory, useParams } from "react-router-dom";

const DeleteUser=()=>{
    let history=useHistory();
    const{userId}=useParams();
    const onSubmit=async e=>{
        e.preventDefault();
        console.log("on Submit"+userId)
        await axios.delete("http://localhost:8080/api/v1/users");

    };

    return 
    toast("User with Provided Id Deleted Successfully!")


}
export default DeleteUser;