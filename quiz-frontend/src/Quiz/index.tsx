import {useLocation} from "react-router-dom";
import {Quiz} from "../Quizes/types";
import QuizPage from "./QuizPage";
import {useEffect, useState} from "react";

function QuizView() {

  const [quiz, setQuiz] = useState<Quiz>();
  let location = useLocation();
  useEffect(() => {
    setQuiz(location.state as Quiz)
  },[location.state])

  if (!quiz) return (
      <h1>This quiz doesn't exist</h1>
  )
  return (
      <div className="quiz-detail-container">
        <QuizPage quiz={quiz}/>
      </div>
  )
}

export default QuizView;
