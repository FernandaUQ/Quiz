import {Quiz} from "../Quizes/types";
import PerguntaCard from "./PerguntaCard";
import './styles.css';


type Props = {
  quiz: Quiz;
}

function QuizPage({quiz}: Props) {


  return (
      <>
        <div>
          <img src={quiz.imgUrl} alt={quiz.titulo}/>
          <h1>{quiz.titulo}</h1>
          <div>
            {quiz.perguntas.map(pergunta => (
                <PerguntaCard
                    key={pergunta.id}
                    pergunta={pergunta}
                />
            ))}
          </div>
        </div>
      </>
  )
}

export default QuizPage;