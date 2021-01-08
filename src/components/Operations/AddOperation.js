import React,{ Component} from 'react'
import './AddOperation.css'; //the css file
import OperationServices from "../../Actions/operationServices/OperationServices";
import { Link } from "react-router-dom";
import Typography from "@material-ui/core/Typography";
const { FaRegFileArchive } = require("react-icons/fa");

// import { AiFillCaretRight } from 'react-icons/ai';

class AddOperation extends Component {
  constructor() {
    super();
    this.state = {
        libelle: "",
        typeOperationComptable: "",
        montant: "",
        dateOperation: "",
        annee: "",
        compteComptable: "",
        societe: "",
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
        libelle: this.state.libelle,
        typeOperationComptable: this.state.typeOperationComptable,
        montant: this.state.montant,
        dateOperation: this.state.dateOperation,
        annee: this.state.annee,
        compteComptable: this.state.raisonSocial,
        societe: this.state.societe
    };
    /////
    // const formData = new FormData();
    // formData.append(data);
    console.log(data)
    OperationServices.create(data)
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
  // const classes=useStyles()
  render(){
    return (
      
      <div className='form-content-right'>
      <form  className='form' onSubmit={this.onSubmit}>
        <div className='form-inputs'>
          <label className='form-label'>libelle</label>
          <input
            className='form-input'
            type='text'
            name='libelle'
            placeholder='Enter libelle'
            value={this.state.libelle}
            onChange={this.onChange}
          />
          {/* {errors.ice && <p>{errors.ice}</p>} */}
        </div>
        <div className='form-inputs'>
          <label className='form-label'>typeOperationComptable</label>
          <input
            className='form-input'
            type='text'
            name='typeOperationComptable'
            placeholder='choose typeOperationComptable'
            value={this.state.typeOperationComptable}
            onChange={this.onChange}
          />
          {/* {errors.raisonSocial && <p>{errors.raisonSocial}</p>} */}
        </div>
        <div className='form-inputs'>
          <label className='form-label'>montant</label>
          <input
            className='form-input'
            type='text'
            name='montant'
            placeholder='enter montant'
            value={this.state.montant}
            onChange={this.onChange}
          />
          {/* {errors.raisonSocial && <p>{errors.raisonSocial}</p>} */}
        </div>
        <div className='form-inputs'>
          <label className='form-label'>dateOperation</label>
          <input
            className='form-input'
            type='datetime-local'
            name='dateOperation'
            placeholder='choose dateOperation'
            value={this.state.dateOperation}
            onChange={this.onChange}
          />
          {/* {errors.raisonSocial && <p>{errors.raisonSocial}</p>} */}
        </div>
        <div className='form-inputs'>
          <label className='form-label'>compteComptable</label>
          <input
            className='form-input'
            type='text'
            name='compteComptable'
            placeholder='choose compteComptable'
            value={this.state.compteComptable}
            onChange={this.onChange}
          />
          {/* {errors.raisonSocial && <p>{errors.raisonSocial}</p>} */}
        </div>
        <div className='form-inputs'>
          <label className='form-label'>societe</label>
          <input
            className='form-input'
            type='text'
            name='societe'
            placeholder='enter societe'
            value={this.state.societe}
            onChange={this.onChange}
          />
          {/* {errors.raisonSocial && <p>{errors.raisonSocial}</p>} */}
        </div>
        
        <button className='form-input-btn' type='submit'>
          Submit 
        </button>
      </form>
      {/* <Link  className='link'>
                <Typography align="left">
                    &#x2190; Head back to save data companies
          </Typography>
            </Link> */}
    </div>
  )

  }
    
}

export default AddOperation
