-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2022 at 08:36 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `phoenix_airline_db`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `acceptg1` (IN `username` VARCHAR(255))  BEGIN
Start TRANSACTION;
INSERT INTO checkflights
SELECT Destination,Flight ID from flight_details
WHERE uname = username;





INSERT INTO stafflogin
SELECT uname, password from temp_staff_details
WHERE uname = username;






CREATE DEFINER=`root`@`localhost` PROCEDURE `acceptg2` (IN `username` VARCHAR(255))  BEGIN
Start TRANSACTION;
INSERT INTO grade02staff
SELECT uname,fullname,empid,password from temp_staff_details
WHERE uname = username;





INSERT INTO stafflogin02
SELECT uname, password from temp_staff_details
WHERE uname = username;







DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`uname`, `password`) VALUES
('admin', 'px256%731');

-- --------------------------------------------------------

--
-- Table `bookflight`
--

CREATE TABLE `bookflight` (
  `uname` varchar(80) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `passportid` varchar(100) NOT NULL,
  `email` varchar(80) NOT NULL,
  `from` varchar(100) NOT NULL,
  `to` varchar(100) NOT NULL,
  `date` varchar(20) NOT NULL,
  `class` varchar(20) NOT NULL,
  `person` varchar(50) NOT NULL,
  `payment_method` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
--  table data `bookflight`
--

INSERT INTO `bookflight` (`uname`, `fullname`, `passportid`, `email`,'from',`to`, `date`, `class`, `person`, `payment_method`,) VALUES
('Himaya', 'Himaya Kumari', '4555678567f', 'himayakumaria@gmail.com', 'India', 'Itali', '2022-01-01', 'premium', '2', 'visa'),
('pahandi', 'pahandi perera','4555678568f', 'pahandi2929@gmail.com', 'France', 'Malaysiya', '2022-01-01', 'first', '2', 'paypal'),
('Amantha','Amantha karunarathna','4555678569f', 'amanthad12@gmail.com', 'India', 'Thailand', '2022-01-01', 'normal', '1', 'visa'),
('Rveena', 'Dasun Kumara','4555678570f', 'dasunakumara@gmail.com', 'srilanka', 'Itali', '2022-01-01', 'first', '3', 'paypal');



--
-- Table structure for table `flightDetails`
--

CREATE TABLE `flightsDetails` (
  `flightid` varchar(50) NOT NULL,
  `Destination` varchar(50) NOT NULL,
  `departdate` varchar(10) NOT NULL,
  `chiefpilot` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `flightsDetails`
--

INSERT INTO `flightDetails` (`flightid`, `destination`, `departdate`, `chiefpilot`) VALUES
('P405', 'Chikago', '2022-02-20', 'Perera kumarasinha'),
('P406', 'Malyasiya', '2022-05-10', 'Kasun Disanayka'),
('P407', 'Thailand', '2022-02-25','Amal Nuvantha' ),
('P408', 'autralia', '2022-05-15','Praveen Hevage' ),
('P409', 'autralia', '2022-05-25','Madawa Dasun' ),
('P410', 'India', '2022-03-29', 'Naveen Prsanna'),
('P411', 'Switzerland', 'Itali', '2022-05-26','Mahela Werapala' ),


--
-- Table structure for table `grade01staff`
--

CREATE TABLE `grade01staff` (
  `fullname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `grade01staff`
--

INSERT INTO `grade01staff` ( `fullname`, `email', 'password') VALUES
( 'Nimali perera','nimali29@gmail.com', ' wrx4$NPD'),
( 'Amal Disanayaka', 'Amali@gmail.com', 'Wpr%5ADM'),
( 'Sachindu Gayan', 'sachindu@gmail.com', 'wrx5$SGY'),
( 'Avish Hemal', 'avish29@gmail.com', 'npr5%AHB');



--
-- Table structure for table `grade02staff`
--

CREATE TABLE `grade02staff` (
  `fullname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `grade02staff`
--

INSERT INTO `grade02staff` (`fullname`, `email`, `password`) VALUES
( 'Nimmi Madushika', 'nimmi@gmail.com', 'qwp6%NMP'),
( 'Maveen Nirmal', 'maveen@gmail.com', 'sty%5MNR'),
( 'Gihan Kanishka, 'gihan29@gmail.com', 'pwr@4GKR'),
( 'Nimesh Karunarathna', 'nimesh@gmail.com', 'PSY%ss5NKM');

-- --------------------------------------------------------

--
-- Table structure for table `stafflogin`
--

CREATE TABLE `stafflogin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stafflogin`
--

INSERT INTO `stafflogin` (`username`, `Password`) VALUES
('Nimmi', 'qwp6%NMP'),
('Gihan', 'pwr@4GKR'),
('Avish', 'npr5%AHB'),
('Sachindu', 'wrx5$SGY'),
('Maveen', 'sty%5MNR'),
('Amal', 'Wpr%5ADM'),
('admin',' px256%731'),
('Nimesh', 'PSY%ss5NKM'),
('Nimali', 'wrx4$NPD');



--
-- Table structure for table `stafflogin02`
--

CREATE TABLE `stafflogin02` (
  `username` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stafflogin02`
--

INSERT INTO `stafflogin02` (`username`, `password`) VALUES
( 'Nimmi Madushika', 'qwp6%NMP'),
( 'Maveen Nirmal', 'sty%5MNR'),
( 'Gihan Kanishka,  'pwr@4GKR'),
( 'Nimesh Karunarathna', 'PSY%ss5NKM');

--
-- Table structure for table `ticketdetails`
--

CREATE TABLE `ticketdetails` (
  'flightid' varchar(50) NOT NULL,
  'passengerid' varchar(10) NOT NULL,
  'departuredate' varchar(10) NOT NULL,
  'destination' varchar(50)NOT NULL,
  'seatnumber' varchar(20)NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ticketdetails`
--

INSERT INTO `ticketdetails` ('flightid', 'passengerid', 'departdate','destination',' seatnumber') VALUES
('p405.'300030001', '2022-02-24', 'India','s102'),
('p405.300030002', '2022-05-20', 'Chikago','s103'),
('p405.300030003', '2022-04-29', 'France','s104 '),
('p405.300030004', '2022-06-20', 'Itali','s105'),
('p405.300030005', '2022-2-23', 'switzerland','s106);





--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `userid` varchar(50) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `ticketid` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`userid`, `fullname`, `email`, `ticketid`) VALUES
('U1001004',Nirmal Kerthirathna', 'nirmal@gmail', '	t2560'),
('U1001005','Phasara Nilupul', 'pahasara@gmail.com,'t3560'),
('U1001006','Vikum Dahamsara', 'vikum@gmail.com', 't2070'),
('U10081007','Nelum Sewwandi', 'nelum@gmail.com', t1390);



--
-- Table structure for table `userlogin`
--

CREATE TABLE `userlogin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userlogin`
--

INSERT INTO `userlogin` (`username`, `password`) VALUES
('admin', 'px256%731'),
('nirmal01','23451200p'),
('admin', '25673125p'),
('pahasara','23452300p'),
('admin','px256%731'),
('Vikum', '24534109p'),
('Nelum2', '24356781p'),
('vikum', '23451278p'),
('Nimani', '2345127p'),
('Nelum2','2384129p');
COMMIT;


