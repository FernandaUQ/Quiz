import { Quiz } from "../Quizes/types";
import PerguntaCard from "./PerguntaCard";
import './styles.css';
import {useEffect, useState} from "react";
import ResultadoScreen from "./Resultado/ResultadoScreen";

type Props = {
    quiz: Quiz;
};

function QuizPage({ quiz }: Props) {
    const [totalPontuacao, setTotalPontuacao] = useState(0);
    const [showResult, setShowResult] = useState(false); // Use o useState para gerenciar showResult
    const [allSelected, setAllSelected] = useState(false); // Use o useState para gerenciar showResult
    useEffect(() => {
        let totalSelected = quiz.perguntas.filter(pergunta => pergunta.alternativas.filter(alt => alt.selected).length > 0).length
        setAllSelected(totalSelected === quiz.perguntas.length)
    }, [totalPontuacao])

    function scrowToNext(perguntaId: number) {
        let element = document.getElementById("pergunta-container-" + perguntaId);
        if (element) {
            element.scrollIntoView();
        }
    }

    const handlePontuacao = (perguntaId: number, alternativaPontuacao: number) => {
        const novaPontuacao = totalPontuacao + alternativaPontuacao;
        setTotalPontuacao(novaPontuacao);
        scrowToNext(perguntaId);
    };


    return (
        <>
            {showResult ? (
                <div className="quiz-resultado">
                    <ResultadoScreen quiz={quiz} totalPontuacao={totalPontuacao} />
                </div>
            ) : (
                <div className="quiz-details">
                    <img src={quiz.imgUrl} alt={quiz.titulo} />
                    <h1>{quiz.titulo}</h1>
                    <div>
                        {quiz.perguntas.map((pergunta) => (
                            <PerguntaCard
                                key={pergunta.id}
                                pergunta={pergunta}
                                onSelectAlternativa={(alternativaPontuacao) =>
                                    handlePontuacao(pergunta.id, alternativaPontuacao)
                                }
                            />
                        ))}
                    </div>
                   <div className="show-result">
                       <button className="button-show-result" onClick={() => setShowResult(!showResult)} disabled={!allSelected}>
                           Ver resultado
                       </button>
                   </div>
                </div>
            )}
        </>
    );
}

export default QuizPage;