import "./styles.css";
import { ReactComponent as Icone } from './icon.svg';
import { Link } from "react-router-dom";

function Navbar (){
    return(
        <nav className="main-navbar">
            <Icone/>
            <Link className="logo-text" to="/" >Quiz</Link>
        </nav>
    )
}
export default Navbar;