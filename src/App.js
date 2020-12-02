import React from 'react';
import './App.css';
import Navbar from './components/Navbar';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import Home from './pages/Home';
import Reports from './pages/Reports';
import addSociete from './pages/addSociete';
import AddSociete from './components/Societes/AddSociete';
import {Provider} from 'react-redux';
import store from './store';

function App() {
  return (
    <>
    <Provider store={store}>
      <Router>
        <Navbar />
        <Switch>
          <Route path='/' exact component={Home} />
          <Route path='/reports' component={Reports} />
          <Route path='/addSociete' component={addSociete} />
          <Route path='/Societe' component={AddSociete} />
        </Switch>
      </Router>
      </Provider >
    </>
  );
}

export default App;
