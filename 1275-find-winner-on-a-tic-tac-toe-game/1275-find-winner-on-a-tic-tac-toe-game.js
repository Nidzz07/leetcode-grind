/**
 * @param {number[][]} moves
 * @return {string}
 */
var tictactoe = function(moves) {
    let rows = Array.from({length: 2}, () => new Array(3).fill(0));
    let cols = Array.from({length: 2}, () => new Array(3).fill(0));
    let diag1 = [0, 0]; 
    let diag2 = [0, 0]; 

    for (let i = 0; i < moves.length; i++) {
        let r = moves[i][0];
        let c = moves[i][1];
        let p = i % 2; 

        rows[p][r]++;
        cols[p][c]++;
        if (r === c) diag1[p]++;
        if (r + c === 2) diag2[p]++;

        if (rows[p][r] === 3 || cols[p][c] === 3 || diag1[p] === 3 || diag2[p] === 3) {
            return p === 0 ? "A" : "B";
        }
    }

    return moves.length === 9 ? "Draw" : "Pending";
};