import React,{ Component} from 'react'
import './AddSociete.css'; //the css file
import SocieteServices from "../../Actions/societesServices/SocieteServices";
const { FaRegFileArchive } = require("react-icons/fa");

// import { AiFillCaretRight } from 'react-icons/ai';

class AddSociete extends Component {
  constructor() {
    super();
    this.state = {
      ice: "",
      raisonSocial: ""
    };
    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
  }
  onChange(e) {
    this.setState({ [e.target.name]: e.target.value });
  }

  onSubmit(e) {
    e.preventDefault();
    console.log("after submiting")
    var data = {
      ice: this.state.ice,
      raisonSocial: this.state.raisonSocial
    };
    /////
    // const formData = new FormData();
    // formData.append(data);
    console.log(data)
    SocieteServices.create(data)
      .then(response => {
        
        console.log(response.data);
      })
      .catch(e => {
        console.log(e);
      });
  }
  // 
  
  // const saveSociete= (e) =>  {
  //   e.preventDefault()
  
  //   console.log("after submiting")
  //   var data = {
  //     ice: societe.ice,
  //     raisonSocial: societe.raisonSocial
  //   };
  //   /////
  //   // const formData = new FormData();
  //   // formData.append(data);
  //   console.log(data)
  //   SocieteServices.create(data)
  //     .then(response => {
  //       setSociete({
  //         id: response.data.id,
  //         ice: response.data.ice,
  //         raisonSocial: response.data.raisonSocial,
  //         published: response.data.published
  //       });
  //       setSubmitted(true);
  //       console.log(response.data);
  //     })
  //     .catch(e => {
  //       console.log(e);
  //     });
  // };
  

  // const newSociete = () => {
  //   setSociete(initialSocieteState);
  //   setSubmitted(false);
  // };
  render(){
    return (
      <div className='form-content-right'>
      <form  className='form' onSubmit={this.onSubmit}>
        <div className='form-inputs'>
          <label className='form-label'>ICE</label>
          <input
            className='form-input'
            type='text'
            name='ice'
            placeholder='Enter company ICE'
            value={this.state.ice}
            onChange={this.onChange}
          />
          {/* {errors.ice && <p>{errors.ice}</p>} */}
        </div>
        <div className='form-inputs'>
          <label className='form-label'>raisonSocial</label>
          <input
            className='form-input'
            type='text'
            name='raisonSocial'
            placeholder='Enter raison social'
            value={this.state.raisonSocial}
            onChange={this.onChange}
          />
          {/* {errors.raisonSocial && <p>{errors.raisonSocial}</p>} */}
        </div>
        {/* <div className='form-inputs'>
          <label className='form-label'>ICE</label>
          <input
            className='form-input'
            type='password'
            name='password'
            placeholder='Enter ICE'
          //   value={values.password}
          //   onChange={handleChange}
          />
            {errors.password && <p>{errors.password}</p>}
        </div>
        <div className='form-inputs'>
          <label className='form-label'>raison social</label>
          <input
            className='form-input'
            type='password'
            name='password2'
            placeholder='social'
          //   value={values.password2}
          //   onChange={handleChange}
          />
          {errors.password2 && <p>{errors.password2}</p>}
        </div> */}
        <button className='form-input-btn' type='submit'>
          Submit 
        </button>
      </form>
    </div>
  )

  }
    
}

export default AddSociete
