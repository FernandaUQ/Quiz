import axios from "axios";

const API_URL = 'https://quiz-sistema.herokuapp.com';

export function fetchQuiz (){
    return axios(`${API_URL}/quiz`)
}

