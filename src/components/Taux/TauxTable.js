import React from 'react'
import { makeStyles } from "@material-ui/core/styles";
import Table from "@material-ui/core/Table";
import TableBody from "@material-ui/core/TableBody";
import TableCell from "@material-ui/core/TableCell";
import TableContainer from "@material-ui/core/TableContainer";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import Paper from "@material-ui/core/Paper";
// import Avatar from "@material-ui/core/Avatar";
// import GroupIcon from "@material-ui/icons/Group";
import { Link } from "react-router-dom";
import Typography from "@material-ui/core/Typography";
import CircularProgress from "@material-ui/core/CircularProgress";
import TauxServices from "../../Actions/TauxServices/TauxServices";


const useStyles = makeStyles(theme => ({
    table: {
      minWidth: 600
    },
    avatar: {
      margin: theme.spacing(1),
      backgroundColor: theme.palette.secondary.main
    },
    paper: {
      display: "flex",
      flexDirection: "column",
      justifyContent: "center",
      alignItems: "center",
      margin: `10px`,
      height: "100%",
      width: "99%",
      marginTop: theme.spacing(7)
    },
    link: {
      color: "rgba(0,0,0,0.65)",
      textDecoration: "none",
      marginLeft: "10%",
      alignSelf: "flex-start",
      "&:hover": {
        color: "rgba(0,0,0,1)"
      }
    }
  }));
function TauxTable() {
    const classes = useStyles();

    const [data, upDateData] = React.useState([]);
    const [firstLoad, setLoad] = React.useState(true);
    let isLoading = true;


    async function sampleFunc() {
        console.log("getting Taux IS data")
        TauxServices.getAll()
            .then(response => {
                console.log(response.data)
                // let responseData =  fetch(response.data);
                // let body =  responseData.json();
                upDateData(response.data);
                console.log("body data ");
                //console.log(data);
            })
            .catch(e => {
                console.log(e);
            });

    }

    if (firstLoad) {
        sampleFunc();
        setLoad(false);
    }

    if (data.length > 0) isLoading = false;

    return (
        <div className={classes.paper}>
            {/* <Avatar className={classes.avatar}>
          <GroupIcon />
        </Avatar> */}
            <Typography component="h1" variant="h5">
                Taux IS Directory
        </Typography>

            {isLoading ? (
                <CircularProgress />
            ) : (
                    <TableContainer
                        style={{ width: "80%", margin: "0 10px" }}
                        component={Paper}
                    >
                        <Table className={classes.table} aria-label="simple table">
                            <TableHead>
                                <TableRow>
                                    <TableCell align="center">Id</TableCell>
                                    <TableCell align="center">date Max</TableCell>
                                    <TableCell align="center">date Min</TableCell>
                                    <TableCell align="center">Libelle</TableCell>
                                    <TableCell align="center">Montant Max</TableCell>
                                    <TableCell align="center">Montant Min</TableCell>
                                    <TableCell align="center">Montant Retard</TableCell>
                                    <TableCell align="center">pourcentage</TableCell>
                                </TableRow>
                            </TableHead>
                            <TableBody>
                                {data?.map(row => (
                                    <TableRow key={row.name}>
                                        <TableCell align="center">{row.id}</TableCell>
                                        <TableCell align="center">{row.dateMax}</TableCell>
                                        <TableCell align="center">{row.dateMin}</TableCell>
                                        <TableCell align="center">{row.libelle}</TableCell>
                                        <TableCell align="center">{row.montantMax}</TableCell>
                                        <TableCell align="center">{row.montantMin}</TableCell>
                                        <TableCell align="center">{row.montantRetard}</TableCell>
                                        <TableCell align="center">{row.pourcentage}</TableCell>
                                    </TableRow>
                                ))}
                            </TableBody>
                        </Table>
                    </TableContainer>
                )}
            <Link className={classes.link} to="/AddTaux">
                <Typography align="left">
                    &#x2190; Head back to save data TauxIS
          </Typography>
            </Link>
        </div>
    );
}


export default TauxTable