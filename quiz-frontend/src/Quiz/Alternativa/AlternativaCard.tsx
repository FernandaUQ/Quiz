import { Alternativa } from "../types";

type Props = {
    alternativa: Alternativa;
}

function AlternativaCard ({ alternativa }:Props){
    return(
        <div>
            <h1>{alternativa.descricao}</h1>
        </div>
    )
}

export default AlternativaCard;