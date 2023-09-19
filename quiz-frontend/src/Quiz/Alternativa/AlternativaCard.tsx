import {Alternativa} from "../../Quizes/types";

type Props = {
    alternativa: Alternativa;
    selectedId: number | null;
    onSelectAlternativa: () => void;
};

function AlternativaCard({ alternativa, selectedId, onSelectAlternativa }: Props) {
    const className = selectedId === alternativa.id ? "alternativa-container-selected" : "alternativa-container";

    return (
        <div className={className} onClick={onSelectAlternativa}>
          <p>{alternativa.id} - {alternativa.descricao}</p>
      </div>
  )
}

export default AlternativaCard;
