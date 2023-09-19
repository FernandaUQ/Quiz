import { Pergunta } from "../Quizes/types";
import { Alternativa } from "../Quizes/types";
import AlternativaCard from "./Alternativa/AlternativaCard";
import { useState } from "react";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faRotateRight } from "@fortawesome/free-solid-svg-icons";

type Props = {
    pergunta: Pergunta;
    onSelectAlternativa: (alternativaPontuacao: number) => void;
};

function PerguntaCard({ pergunta, onSelectAlternativa }: Props) {
    const [selectedId, setSelectedId] = useState<number | null>(null);

    const handleAlternativaClick = (alternativa: Alternativa) => {
        setSelectedId(alternativa.id);
        onSelectAlternativa(alternativa.pontuacao);
    };

    const handleUndoAlternativaSelect = () => {
        setSelectedId(null);
        onSelectAlternativa(0);
    }

    return (
        <>
            <div className="pergunta-container">
                <div className="header-pergunta">
                    <h2>{pergunta.id} - {pergunta.corpo}</h2>
                    <button className="button-undo" onClick={() => handleUndoAlternativaSelect()}>
                        <FontAwesomeIcon icon={faRotateRight} />
                    </button>
                </div>
                <div className={"alternativas-list" + (selectedId ? " container-disabled" : "")}>
                    {pergunta.alternativas.map((alternativa) => (
                        <AlternativaCard
                            key={alternativa.id}
                            alternativa={alternativa}
                            selectedId={selectedId}
                            onSelectAlternativa={() => handleAlternativaClick(alternativa)}
                        />
                    ))}
                </div>
            </div>
        </>
    );
}

export default PerguntaCard;