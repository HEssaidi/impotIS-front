import React from 'react';
import './App.css';
import Navbar from './components/Navbar';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import Home from './pages/Home';
import Reports from './pages/AddTaux';
import addSociete from './pages/addSociete';
import {Provider} from 'react-redux';
import store from './store';
import SocietesTable from './components/Societes/SocietesTable';
import AddTaux from './pages/AddTaux';
import TauxTable from './components/Taux/TauxTable';

function App() {
  return (
    <>
    <Provider store={store}>
      <Router>
        <Navbar />
        <Switch>
          <Route path='/' exact component={Home} />
          <Route path='/AddTaux' component={AddTaux} />
          <Route path='/addSociete' component={addSociete} />
          {/* <Route path='/Societe' component={AddSociete} /> */}
          <Route path='/societeTable' component={SocietesTable} />
          <Route path='/tauxTable' component={TauxTable} />
        </Switch>
      </Router>
      </Provider >
    </>
  );
}

export default App;
