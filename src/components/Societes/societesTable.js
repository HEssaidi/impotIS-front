// import React from "react";
// import { makeStyles } from "@material-ui/core/styles";
// import Table from "@material-ui/core/Table";
// import TableBody from "@material-ui/core/TableBody";
// import TableCell from "@material-ui/core/TableCell";
// import TableContainer from "@material-ui/core/TableContainer";
// import TableHead from "@material-ui/core/TableHead";
// import TableRow from "@material-ui/core/TableRow";
// import Paper from "@material-ui/core/Paper";
// import Avatar from "@material-ui/core/Avatar";
// import GroupIcon from "@material-ui/icons/Group";
// import { Link } from "react-router-dom";
// import Typography from "@material-ui/core/Typography";
// import CircularProgress from "@material-ui/core/CircularProgress";
// import React from 'react'

// function societesTable() {
//     const classes = useStyles();
  
//     const [data, upDateData] = React.useState([]);
//     const [firstLoad, setLoad] = React.useState(true);
//     let isLoading = true;
    

//     // const saveSociete= (e) =>  {
//   //   e.preventDefault()
  
//   //   console.log("after submiting")
//   //   var data = {
//   //     ice: societe.ice,
//   //     raisonSocial: societe.raisonSocial
//   //   };
//   //   /////
//   //   // const formData = new FormData();
//   //   // formData.append(data);
//   //   console.log(data)
//   //   SocieteServices.create(data)
//   //     .then(response => {
//   //       setSociete({
//   //         id: response.data.id,
//   //         ice: response.data.ice,
//   //         raisonSocial: response.data.raisonSocial,
//   //         published: response.data.published
//   //       });
//   //       setSubmitted(true);
//   //       console.log(response.data);
//   //     })
//   //     .catch(e => {
//   //       console.log(e);
//   //     });
//   // };


//     async function sampleFunc() {
//       let response = await fetch("impotIS-api/impot");
//       let body = await response.json();
//       upDateData(body);
//     }
  
//     if (firstLoad) {
//       sampleFunc();
//       setLoad(false);
//     }
  
//     if (data.length > 0) isLoading = false;
  
//     return (
//       <div className={classes.paper}>
//         {/* <Avatar className={classes.avatar}>
//           <GroupIcon />
//         </Avatar> */}
//         <Typography component="h1" variant="h5">
//           Societe Directory
//         </Typography>
  
//         {isLoading ? (
//           <CircularProgress />
//         ) : (
//           <TableContainer
//             style={{ width: "80%", margin: "0 10px" }}
//             component={Paper}
//           >
//             <Table className={classes.table} aria-label="simple table">
//               <TableHead>
//                 <TableRow>
//                   <TableCell align="center">Id</TableCell>
//                   <TableCell align="center">ice</TableCell>
//                   <TableCell align="center">raisonSocial</TableCell>
//                 </TableRow>
//               </TableHead>
//               <TableBody>
//                 {data?.map(row => (
//                   <TableRow key={row.name}>
//                     <TableCell align="center">{row.id}</TableCell>
//                     <TableCell align="center">{row.ice}</TableCell>
//                     <TableCell align="center">{row.raisonSocial}</TableCell>
//                   </TableRow>
//                 ))}
//               </TableBody>
//             </Table>
//           </TableContainer>
//         )}
//         <Link className={classes.link} to="/">
//           <Typography align="left">
//             &#x2190; Head back to save data
//           </Typography>
//         </Link>
//       </div>
//     );
// }
// export default societesTable