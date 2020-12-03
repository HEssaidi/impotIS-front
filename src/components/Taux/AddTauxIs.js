import React, { Component } from 'react'
import '../Societes/AddSociete.css'; //the css file
import TauxServices from "../../Actions/TauxServices/TauxServices";

class AddTauxIs extends Component {
    constructor() {
        super();
        this.state = {
            libelle: "",
            dateMax: "",
            dateMin: "",
            montantMax: "",
            montantMin: "",
            pourcentage: "",
            montantRetard: ""
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
            dateMax: this.state.dateMax,
            dateMin: this.state.dateMin,
            montantMax: this.state.montantMax,
            montantMin: this.state.montantMin,
            pourcentage: this.state.pourcentage,
            montantRetard: this.state.montantRetard
        };
        /////
        // const formData = new FormData();
        // formData.append(data);
        console.log(data)
        TauxServices.create(data)
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
    render() {
        return (

            <div className='form-content-right'>
                <form className='form' style={{top: "60%"}} onSubmit={this.onSubmit}>
                {/* <h4 className='title'> Ajout du taux IS </h4> */}
                <div className='form-inputs'>
                        <label className='form-label'>Date Max</label>
                        <input
                            className='form-input'
                            type='datetime-local'
                            name='dateMax'
                            placeholder='Enter date Max'
                            value={this.state.dateMax}
                            onChange={this.onChange}
                        />
                        {/* {errors.ice && <p>{errors.ice}</p>} */}
                    </div>
                    <div className='form-inputs'>
                        <label className='form-label'>Date Min</label>
                        <input
                            className='form-input'
                            type='datetime-local'
                            name='dateMin'
                            placeholder='Enter date Min'
                            value={this.state.dateMin}
                            onChange={this.onChange}
                        />
                        {/* {errors.ice && <p>{errors.ice}</p>} */}
                    </div>
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
                        <label className='form-label'>Montant Max</label>
                        <input
                            className='form-input'
                            type='text'
                            name='montantMax'
                            placeholder='Enter montantMax'
                            value={this.state.montantMax}
                            onChange={this.onChange}
                        />
                        {/* {errors.raisonSocial && <p>{errors.raisonSocial}</p>} */}
                    </div>
                    <div className='form-inputs'>
                        <label className='form-label'>Montant Min</label>
                        <input
                            className='form-input'
                            type='text'
                            name='montantMin'
                            placeholder='Enter montantMin'
                            value={this.state.montantMin}
                            onChange={this.onChange}
                        />
                        {/* {errors.raisonSocial && <p>{errors.raisonSocial}</p>} */}
                    </div>
                    <div className='form-inputs'>
                        <label className='form-label'>Montant Retard</label>
                        <input
                            className='form-input'
                            type='text'
                            name='montantRetard'
                            placeholder='Enter montantRetard'
                            value={this.state.montantRetard}
                            onChange={this.onChange}
                        />
                        {/* {errors.raisonSocial && <p>{errors.raisonSocial}</p>} */}
                    </div>
                    <div className='form-inputs'>
                        <label className='form-label'>Pourcentage</label>
                        <input
                            className='form-input'
                            type='number'
                            step="0.1"
                            min='0'
                            name='pourcentage'
                            placeholder='Enter %%%pourcentage%%%'
                            value={this.state.pourcentage}
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

export default AddTauxIs