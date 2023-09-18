import axios from "axios";

const API_URL = 'http://localhost:8080';

export function fetchQuiz (){
    return axios(`${API_URL}/quiz`)
}

