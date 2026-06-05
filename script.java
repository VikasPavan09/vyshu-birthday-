function yes() {
  document.getElementById("proposal-content").style.display = "none";
  document.getElementById("result").innerHTML =
    "❤️ Nijam cheppali ante...\n\nNi love ki nen right person or kadhu ane vishayam nak thelidhu...\n\nBut I promise I will always stay with you ❤️";

  document.getElementById("result").style.display = "block";
}

function no() {
  document.getElementById("proposal-content").style.display = "none";
  document.getElementById("result").innerHTML =
    "🌹 Pedhaga cheppaniki inkem ledhu...\n\nBut you will always be special to me ❤️";

  document.getElementById("result").style.display = "block";
}
