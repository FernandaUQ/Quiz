import {Alternativa} from "../../Quizes/types";

type Props = {
  alternativa: Alternativa;
}

function AlternativaCard({alternativa}: Props) {
  return (
      <div className="alternativa-container">
        <p>{alternativa.id} - {alternativa.descricao}</p>
      </div>
  )
}

export default AlternativaCard;
