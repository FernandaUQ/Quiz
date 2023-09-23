import QuizCard from "./QuizCard";
import {Quiz} from "./types";
import './styles.css';



type Props = {
  quizes: Quiz[];
}

function QuizList({quizes}: Props) {
  return (
      <>
      <div className="quiz-list-container">
          {quizes.map(quiz => (
                <QuizCard
                    key={quiz.id}
                    quiz={quiz}
                />
          ))}
      </div>
      </>
  )
}

export default QuizList;
