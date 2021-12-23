import {Pergunta} from "../Quizes/types";
import AlternativaCard from "./Alternativa/AlternativaCard";

type Props = {
  pergunta: Pergunta
}

function PerguntaCard({pergunta}: Props) {
  return (
      <>
        <div className="pergunta-container">
          <h2>{pergunta.id} - {pergunta.corpo}</h2>
          <div className="alternativas-list">
            {pergunta.alternativas.map(alternativa => (
                <AlternativaCard
                    key = {alternativa.id}
                    alternativa={alternativa}
                />
            ))
            }
          </div>
        </div>
      </>
  )
}

export default PerguntaCard