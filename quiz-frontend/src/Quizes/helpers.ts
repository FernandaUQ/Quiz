import { Quiz } from "./types";

export function checkIsSelected(selectedQuizes: Quiz[], quiz: Quiz){
    return  selectedQuizes.some(item => item.id === quiz.id);
      
}