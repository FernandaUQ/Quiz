import {useLocation} from "react-router-dom";
import {Quiz} from "../Quizes/types";

function QuizView() {
  let quiz = useLocation().state as Quiz
  if (!quiz) return (
      <h1>This quiz doesn't exist</h1>
  )
  console.log(quiz)
  return (
      <>
        <div>
          <img src={quiz.imgUrl} alt={quiz.titulo}/>
          <h2>{quiz.titulo}</h2>
          <div>
          </div>
        </div>
      </>
  )
}

export default QuizView;
