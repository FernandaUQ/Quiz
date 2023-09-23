import axios, {AxiosResponse} from "axios";
import {Resultado} from "./Quizes/types";

const API_URL = process.env["API_URL"] || 'http://localhost:8080';

export function fetchQuiz (){
    return axios(`${API_URL}/quiz`)
}

export function fetchResultado(quizId: string) : Promise<AxiosResponse<Resultado[]>> {
    const url = `${API_URL}/resultado/quiz/${quizId}`;
    return axios.get(url);
}

