import {Quiz, Resultado} from "../../Quizes/types";
import {useEffect, useState} from "react";
import {fetchResultado} from "../../api";

type Props = {
    quiz: Quiz,
    totalPontuacao: number
}

function ResultadoScreen({quiz, totalPontuacao}: Props) {
    const [resultado, setResultado] = useState<Resultado>();

    useEffect(() => {
        fetchResultado(quiz.id.toString())
            .then(response => {
                const result = response.data?.find(res => totalPontuacao >= res.notaMin && totalPontuacao <= res.notaMax);
                setResultado(result);
            })
            .catch(error => console.error(error))
    }, []);


    return (
        <div className="card-resultado">
            <div className="card-resultado-title">
                <h2>{quiz.titulo}</h2>
            </div>
            <div className="card-resultado-img">
                {resultado?.imgUrl
                    ? (<img className="img-resultado" src={resultado?.imgUrl} alt={resultado?.personagem}/>)
                    : (<p>Imagem não disponível</p>
                    )}
            </div>
            <div className="card-resultado-title-bottom">
                <h3>{resultado?.personagem}</h3>
            </div>
        </div>
    )

}

export default ResultadoScreen;