import { BrowserRouter, Route, Switch } from "react-router-dom";
import Navbar from "./Navbar";
import QuizListView from "./Quizes";
import QuizView from "./Quiz";

function Routes() {
  return (
      <BrowserRouter>
        <Navbar/>
        <Switch>
          <Route path='/quiz/:id'>
            <QuizView/>
          </Route>
          <Route path='/'>
            <QuizListView/>
          </Route>
        </Switch>
      </BrowserRouter>
  )
}

export default Routes;
