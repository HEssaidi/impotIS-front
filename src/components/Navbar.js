import React, { useState } from 'react';
import * as FaIcons from 'react-icons/fa';
import * as AiIcons from 'react-icons/ai';
import { Link } from 'react-router-dom';
import { SidebarData } from './SidebarData';  //import the sidebar
import './Navbar.css'; //the css file
import { IconContext } from 'react-icons';

function Navbar() {
  const [sidebar, setSidebar] = useState(false); //for sidebar? false by default is not showing 

  const showSidebar = () => setSidebar(!sidebar); //to show the sidebar

  return (
    <>
      <IconContext.Provider value={{ color: '#fff' }}> {/* </li> color of all icons*/}
        <div className='navbar'>
          <Link to='#' className='menu-bars'>
            <FaIcons.FaBars onClick={showSidebar} />
          </Link>
        </div>
        <nav className={sidebar ? 'nav-menu active' : 'nav-menu'}>
          <ul className='nav-menu-items' onClick={showSidebar}>
            <li className='navbar-toggle'>
              <Link to='#' className='menu-bars'>
                <AiIcons.AiOutlineClose />
              </Link>
            </li>   
            {/* </li>  the sidebar*/}
            {SidebarData.map((item, index) => {
              return (
                // targetting the name,path, icon, title
                <li key={index} className={item.cName}>
                  <Link to={item.path}>
                    {item.icon}
                    <span>{item.title}</span>
                  </Link>
                </li>
              );
            })}
          </ul>
        </nav>
      </IconContext.Provider>
    </>
  );
}

export default Navbar;
