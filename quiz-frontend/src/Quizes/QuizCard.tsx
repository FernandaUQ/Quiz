import {Quiz} from "./types";
import {Link} from "react-router-dom";

type Props = {
    quiz: Quiz;
}


function QuizCard({quiz}: Props) {
    const quizTo = {
        pathname: `/quiz/${quiz.id}`,
        state: quiz
    };
    return (
        <Link className="card-quiz" to={quizTo}>
            <div className="card-quiz-title">
                <h3>
                    {quiz.titulo}
                </h3>
            </div>
            <div className="card-quiz-img">
                <img className="img-quiz" src={quiz.imgUrl} alt={quiz.titulo}/>
            </div>
        </Link>
    )
}

export default QuizCard;
