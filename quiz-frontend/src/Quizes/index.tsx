import { useEffect, useState } from "react";
import { fetchQuiz } from "../api";
import QuizList from "./QuizList";

import { Quiz } from "./types";

function QuizListView(){

    const [quizes, setQuiz] = useState<Quiz[]>([]);

    useEffect(() => {
    fetchQuiz()
    .then(response => setQuiz(response.data))
    .catch( error => console.error(error) )
    }, []);

    return(
            <QuizList quizes = {quizes}/>

    )
}

export default QuizListView;
