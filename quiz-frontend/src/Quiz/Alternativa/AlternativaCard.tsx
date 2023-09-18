import {Alternativa} from "../../Quizes/types";
import {checkIsSelected} from "../../Quizes/helpers";
import {useState} from "react";

type Props = {
  alternativa: Alternativa;
    selectedId: number | null;
    setSelectedId: (id: number | null) => void;
}

function AlternativaCard({alternativa, selectedId, setSelectedId}: Props ) {

    const selectAlternativa = () => {
        return () => {
            setSelectedId(alternativa.id);
        };
    };

    const classname = () => {
        if (selectedId === alternativa.id) {
            return "alternativa-container-selected";
        }
        return "alternativa-container";
    };

  return (
      <div className={classname()}
           onClick={selectAlternativa()}>
          <p>{alternativa.id} - {alternativa.descricao}</p>
      </div>
  )
}

export default AlternativaCard;
