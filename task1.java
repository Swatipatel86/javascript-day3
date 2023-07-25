function calculateArea(length, width) {
  if (typeof length !== 'number' || typeof width !== 'number' || length <= 0 || width <= 0) {
    return undefined; // Return undefined if either length or width is not a positive number.
  }

  const area = length * width;
  return area; // Return the calculated area of the rectangle.
}