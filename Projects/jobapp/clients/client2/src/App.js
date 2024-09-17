// import { Search } from '@mui/icons-material';
import './App.css';
import AllPosts from './components/AllPosts';
import { Routes, Route } from "react-router-dom";
import Create from './components/Create';

import Edit from './components/Edit';

function App() {
  return (
  <>
   <Routes>
   <Route path='/' element={<AllPosts/>}/>
   <Route path="/create" element={<Create />} />
   <Route path="/edit" element={<Edit />} />
   </Routes>
  </>
  );
}

export default App;
