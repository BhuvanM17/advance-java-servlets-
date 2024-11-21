<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form with Background Image</title>
    <style>
        body {
            background-image: url('bg.jpg'); /* Replace with your image path */
            background-size: cover; /* Ensure the background covers the whole screen */
            background-position: center; /* Center the background image */
            background-repeat: no-repeat;
            display: flex;
            justify-content: center; /* Center horizontally */
            align-items: center; /* Center vertically */
            font-family: Arial, sans-serif;
            height: 100vh; /* Ensure full viewport height */
            margin: 0; /* Remove default body margin */
        }

        .form-container {
            width: 100%;
            max-width: 600px; /* Increased form width for 2 fields in a row */
            padding: 20px 30px;
            background-color: rgba(255, 255, 255, 0.7); /* White background with slight transparency */
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
            text-align: left; /* Align text to the left inside the form */
        }

        .form-group {
            margin-bottom: 15px;
        }

        .label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            text-align: left; /* Align label text to the left */
        }

        input, textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px;
        }

        button {
            background-color: #28a745;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            width: 100%; /* Make button the full width */
        }

        button:hover {
            background-color: #218838;
        }

        h1 {
            color: #333;
            font-size: 24px;
            margin-bottom: 20px;
            text-align: center;
        }

        /* New CSS for aligning FirstName and LastName in one row with more gap */
        .name-group {
            display: flex;
            gap: 30px; /* Increased gap between the two fields */
        }

        .name-group .form-group {
            flex: 1; /* Allow both inputs to grow equally */
        }

    </style>
</head>
<body>
    <div class="form-container">
        <h1>PERSONAL DETAILS</h1>
        <form action="user" method="post">
            <div class="name-group">
                <div class="form-group">
                    <label for="firstname" class="label">FirstName:</label>
                    <input type="text" id="firstname" name="firstname" placeholder="Enter your FirstName" required>
                </div>
                <div class="form-group">
                    <label for="lastname" class="label">LastName:</label>
                    <input type="text" id="lastname" name="lastname" placeholder="Enter your LastName" required>
                </div>
            </div>
            <div class="form-group">
                <label for="phone" class="label">Phone No:</label>
                <input type="number" id="phone" name="phone" placeholder="Enter your phone number" required>
            </div>
            <div class="form-group">
                <label for="email" class="label">Email:</label>
                <input type="text" id="email" name="email" placeholder="Enter your email" required>
            </div>
            <div class="form-group">
                <label for="address" class="label">Address:</label>
                <textarea id="address" name="address" placeholder="Enter your address" required></textarea>
            </div>
            <div class="form-group">
                <label for="gender" class="label">Gender:</label>
                <input type="text" id="gender" name="gender" placeholder="Enter your gender" required>
            </div>
            <div class="form-group">
                <label for="gender" class="label">Age:</label>
                 <input type="number" id="age" name="age" placeholder="Enter your age" required>
            </div>
            <div class="form-group">
                   <label for="country" class="label">Country:</label>
                   <input type="text" id="country" name="country" placeholder="Enter your country" required>
            </div>
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>