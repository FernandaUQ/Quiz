import { Quiz } from "../Quizes/types";
import PerguntaCard from "./PerguntaCard";
import './styles.css';
import { useState } from "react";

type Props = {
    quiz: Quiz;
};

function QuizPage({ quiz }: Props) {
    const [totalPontuacao, setTotalPontuacao] = useState(0);

    const handlePontuacao = (perguntaId: number, alternativaPontuacao: number) => {
        const novaPontuacao = totalPontuacao + alternativaPontuacao;
        setTotalPontuacao(novaPontuacao);
    };

    return (
        <>
            <div>
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
            </div>
            <p>Total de Pontuação: {totalPontuacao}</p>
        </>
    );
}

export default QuizPage;