import {Pergunta} from "../Quizes/types";
import {Alternativa} from "../Quizes/types";
import AlternativaCard from "./Alternativa/AlternativaCard";
import {useState} from "react";


type Props = {
    pergunta: Pergunta
}

function PerguntaCard({pergunta}: Props) {
    const [selectedId, setSelectedId] = useState<number | null>(null);
    console.log(selectedId)
    return (
        <>
            <div className="pergunta-container">
                <h2>{pergunta.id} - {pergunta.corpo}</h2>
                <div className="alternativas-list">
                    {pergunta.alternativas.map(alternativa => (
                        <AlternativaCard
                            key={alternativa.id}
                            alternativa={alternativa}
                            selectedId={selectedId}
                            setSelectedId={setSelectedId}
                        />
                    ))
                    }
                </div>
            </div>
        </>
    )
}

export default PerguntaCard