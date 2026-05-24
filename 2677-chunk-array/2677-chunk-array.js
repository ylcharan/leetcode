/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let n = arr.length;
    let res = new Array(Math.ceil(arr.length / size));
    let i = 0;
    for (let z = 0; z < res.length; z++) {
        if (n - size >= 0) {
            res[z] = new Array(size);
            for (let j = 0; j < size; j++) {
                res[z][j] = arr[i];
                i++;
            }
        } else {
            res[z] = new Array(n);
            for (let j = 0; j < n; j++) {
                res[z][j] = arr[i];
                i++;
            }
        }
        n -= size;
    }
    return res;
};
