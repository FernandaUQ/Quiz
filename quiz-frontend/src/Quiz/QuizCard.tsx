import { Quiz } from "./types";

type Props = {
    quiz : Quiz;
}

function QuizCard ({ quiz}:Props){
    return(
        <div>
            <h3 className="order-card-title">
                {quiz.titulo}
            </h3>
            <img 
            src={quiz.imgUrl} alt={quiz.titulo}/>
           </div>
    )
}

export default QuizCard;