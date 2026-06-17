package JAVA_DSA.binarySearch;
// // * LEETCODE PROBLEM NO 1095 

// class Solution {
//     public int findInMountainArray(int target, MountainArray mountainArr) {
//         int peak = peakIndexInMountainArray(mountainArr);
//         if (peak == -1) {
//             return -1;
//         }
//         if (binarySearch(mountainArr, target, 0, peak) != -1) {
//             return binarySearch(mountainArr, target, 0, peak);
//         } else {
//             return binarySearch(mountainArr, target, peak, mountainArr.length() - 1);
//         }
//     }

//     public int binarySearch(MountainArray mountainArr, int target, int start, int end) {

//         boolean isAscending = mountainArr.get(start) < mountainArr.get(end);

//         if (isAscending) {
//             while (start <= end) {
//                 int mid = start + (end - start) / 2;
//                 int valAtMid = mountainArr.get(mid);
//                 if (target < valAtMid) {
//                     end = mid - 1;
//                 } else if (target > valAtMid) {
//                     start = mid + 1;
//                 } else {
//                     return mid;
//                 }
//             }
//         } else {
//             while (start <= end) {
//                 int mid = start + (end - start) / 2;
//                 int valAtMid = mountainArr.get(mid);
//                 if (target < valAtMid) {
//                     start = mid + 1;
//                 } else if (target > valAtMid) {
//                     end = mid - 1;
//                 } else {
//                     return mid;
//                 }
//             }
//         }

//         return -1;
//     }

//     public int peakIndexInMountainArray(MountainArray mountainArr) {
//         int start = 0, end = mountainArr.length() - 1;
//         while (start < end) {
//             int mid = start + (end - start) / 2;

//             if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
//                 end = mid;
//             } else {
//                 start = mid + 1;
//             }
//         }

//         return start;
//     }
// }