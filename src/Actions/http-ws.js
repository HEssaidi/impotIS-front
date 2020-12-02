import axios from "axios";

const baseURL="http://localhost:8090/impotIS-api/impot/";
export default axios.create({
  baseURL: baseURL ,
  headers: {
    "Content-type": "application/json"
  }
});