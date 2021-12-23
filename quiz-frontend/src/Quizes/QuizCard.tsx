import {Quiz} from "./types";
import { Link } from "react-router-dom";

type Props = {
  quiz: Quiz;
}



function QuizCard({quiz}: Props) {
  const quizTo =  {
    pathname: `/quiz/${quiz.id}`,
    state: quiz
  };
  console.log(quiz)
  return (
      <div>
        <Link to={quizTo}>
          <h3 className="order-card-title">
            {quiz.titulo}
          </h3>
          <img
              src={quiz.imgUrl} alt={quiz.titulo}/>
        </Link>
      </div>

  )
}

export default QuizCard;
