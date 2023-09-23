import "./styles.css";
import { Link } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faScroll } from "@fortawesome/free-solid-svg-icons";

function Navbar (){
    return(
        <nav className="main-navbar">
            <Link className="logo-text" to="/">
                <FontAwesomeIcon icon={faScroll} />
                <span className="title">Quiz</span>
            </Link>
        </nav>
    )
}
export default Navbar;