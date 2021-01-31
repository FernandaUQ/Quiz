import "./styles.css";
import { ReactComponent as Icone } from './icon.svg';

function Navbar (){
    return(
        <nav className="main-navbar">
            <Icone/>
            <h1>Quiz</h1>
        </nav>
    )
}
export default Navbar;

/* <div>Ícones feitos por <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/br/" title="Flaticon">www.flaticon.com</a></div>*/