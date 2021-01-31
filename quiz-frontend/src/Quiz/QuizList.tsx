import QuizCard from "./QuizCard";
import { Quiz } from "./types";

type Props = {
    quizes: Quiz[];
}

function QuizList ({ quizes }:Props){
    return(
        <div className="orders-list-container">
            <div className="orders-list-items">
              {quizes.map(quiz => (
                  <QuizCard 
                  key={quiz.id} 
                  quiz={quiz}
                  />
              ))}
            </div>
        </div>
    )
}

export default QuizList;