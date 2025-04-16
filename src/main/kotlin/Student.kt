package org.example

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

val resources = arrayListOf(
    //unit1
    Content("4d2eae26-4744-4f6b-ab6b-40db538cafd2", "Hello!", 72, 1),
    Content("ec8cdddb-561c-4030-84a3-78a723d780a6", "Little Rabbit, Happy Turtle", 73, 1),
    Content("55c99f68-deae-4913-bec2-afbe4252d65d", "Stand Up!", 74, 1),
    Content("e5f6fd1c-eb1c-40e9-b4e4-e7a50596e6cb", "Phonics Funtime D&M", 75, 1),
    Content("5165f748-4c83-429d-b264-48c4f36852bf", "Ten Little Monkeys", 76, 1),
    Content("be16e946-571e-4505-8ee1-9d8d207eae0d", "Lineman D", 77, 1),
    Content("9e08ae2d-6cd8-4053-bb7b-d31f85ceab4b", "What Do You See", 78, 1),
    Content("43e1f21a-0c7f-4885-a497-274055145825", "Lineman M", 79, 1),
    Content("58029a92-52fc-4b6a-a770-6b76ef557fcd", "Monkey", 80, 1),
    Content("849f12e6-34f1-415b-b8b5-9cbde60fcdeb", "Red", 81, 1),
    Content("f2498f87-2904-4cdf-a5fa-b15392a56eea", "Animals Play", 82, 1),
    Content("061487f8-8d44-4b34-adf8-e1bf1547595b", "Flashcard Friends Part 1", 83, 1),
    Content("54d3814d-5ea5-4691-96ca-fc95fa621c57", "Good Morning Song", 84, 1),
    Content("13334e85-6872-44ce-9e02-27271ee4f5a7", "Where", 85, 1),
    Content("27d83e24-effe-47af-bdaa-e5c42d4c4598", "I Love Them All", 86, 1),
    Content("414bbcad-5441-4baf-a2eb-06dac5a936ee", "Friends", 87, 1),
    Content("9c707d4c-dc88-4cbf-bdfe-c071d67104ab", "One", 88, 1),
    Content("30cde435-5d1f-4141-ab4b-f2f444eadc6e", "Phonics Funtime F", 89, 1),
    Content("9ba1b28d-6665-4067-ab51-847864f088d1", "Family and Friends", 90, 1),
    Content("856103ff-702c-49dd-bfb9-2103b5d1d6b2", "Lineman F", 91, 1),
    Content("0abc149a-cde6-4f7c-8a58-489ecccb6ccb", "Hop Like a Rabbit", 92, 1),
    Content("19044d3f-ca05-4962-b12f-25d8a3a0235b", "Family at the Zoo", 93, 1),
    Content("e777bb21-27b0-4c2b-85a5-3079bd313eff", "Flashcard Friends Part 2", 94, 1),
    Content("5b13607a-b159-409b-9175-67f78a8afa14", "Alphabet Song", 95, 1),
    Content("5a1bd3b6-2c19-4f54-947b-801af7247e25", "Zoo", 96, 1),
    Content("b6e8399a-3d58-4b2c-8c48-b2be4b76939d", "Five Little Elephants", 97, 1),
    Content("9fed03f9-093a-402a-aacf-4e34a02f418f", "Mouse in the Barn", 98, 1),
    Content("b82d65a1-7163-4d66-940e-cc77735e041e", "Phonics Funtime K&Z", 99, 1),
    Content("14b94b57-bed4-40a1-ba01-b86a797d1e0c", "Happy Birthday", 100, 1),
    Content("2c560c43-397c-4df1-b97a-db1557b6cdee", "Lineman K", 101, 1),
    Content("78300e38-1f91-4501-acae-805f31860b59", "How Old are You", 102, 1),
    Content("1f9f5bae-1918-489c-b990-00454cd5cc51", "Lineman Z", 103, 1),
    Content("bd72d318-082b-4095-9902-7f7fe9431fcf", "Let's Clean Up", 104, 1),
    Content("a6386e3d-9e9e-441a-8571-84254eb2a16c", "Flashcard Friends Part 3", 105, 1),
    Content("8c79106f-5bba-424c-963d-a1ae91e1ab6f", "Goodbye Song", 106, 1),
    Content("0b3a9d22-f938-40a6-b06a-5eaa7f63cda5", "Jonny Bear “This is Me!”", 107, 1),

    Content("49e8adc4-47dc-4de3-9122-f11e15ae1763", "Early in the Morning", 47, 2),
    Content("80232af2-f6de-4ce9-90e3-5e7d5b91d43e", "Flashcard Friends Part 1", 48, 2),
    Content("e9eb4529-6bfe-4274-9a96-9d1d070d0e32", "Just Wiggle!", 49, 2),
    Content("175bd643-3751-4cb3-baff-ffbc66c6bd36", "Two Little Eyes", 50, 2),
    Content("8b61b131-bf47-4e68-b20b-7216c2ab77d9", "Ten Things", 51, 2),
    Content("60a08dab-06e0-4538-a346-0b542158ff09", "Phonics Funtime L&G", 52, 2),
    Content("50f66ea9-0868-4f14-ae6d-0824fe35678e", "Umbrella", 53, 2),
    Content("0ce36f78-ba8f-4843-a608-853f581d4695", "Lineman L", 54, 2),
    Content("2cea4f1c-dd0d-451b-b459-53b6d1e3b521", "Stand Up and Look Around", 55, 2),
    Content("ea28e3b2-3e77-4eb6-b68b-9592cab877cf", "Blue", 56, 2),
    Content("59c30990-795a-47a6-8344-afb3834e440a", "Lineman G", 57, 2),
    Content("94ab5d93-50ba-47f4-993e-ea7c8792c715", "Hold Hands with a Friend", 58, 2),
    Content("44c97efc-6f8e-4201-86a2-24be82b78668", "Flashcard Friends Part 2", 59, 2),
    Content("f4cb7643-28b4-4308-8437-f901dfa8c5d0", "Nice Things to Say", 60, 2),
    Content("280e3de4-58f9-49b9-80c4-4849e3e6b069", "Kenny Kangaroo", 61, 2),
    Content("d2aaf711-377e-4717-8658-c0e2e761142c", "My Hands", 62, 2),
    Content("ba1b269c-510a-428e-9ea4-c4e042032fce", "All These Things", 63, 2),
    Content("563866ab-d393-425a-b392-6ad7648081bb", "Boy", 64, 2),
    Content("fc42e6cc-5458-4d0d-b84a-88fb561a33db", "Two", 65, 2),
    Content("17a4bf25-f7eb-441b-8ec6-a478af0dfc69", "Phonics Funtime U", 66, 2),
    Content("796a3248-6cae-49de-9d41-f3c415d3e9e5", "What Can You Do", 67, 2),
    Content("ff4066af-c78a-40d1-a22d-a468d8f0db5f", "Lineman U", 68, 2),
    Content("798dca2a-8845-4d3d-93f6-bc05b62c6cde", "Point and Pat", 69, 2),
    Content("6e5487bf-d635-4158-a561-9c22d3569c08", "Too Big, Too Small", 70, 2),
    Content("799aa5ff-f7fc-4605-8d25-8fc5f95f89b5", "Head, Shoulders, Knees and Toes", 71, 2),
    Content("5f05a1c6-ab5e-4fab-918e-6f2d9d2466c6", "Girl", 72, 2),
    Content("8eb16a5e-02ef-4205-88d2-f26f81894a0c", "Phonics Funtime B", 73, 2),
    Content("0f7e57c3-313a-40de-be18-ee1e96cc9bee", "Lineman B", 74, 2),
    Content("b52f0438-868b-4aa1-9781-6149d0cffe7f", "Mother Who Lives in a Boot", 75, 2),
    Content("9cecc9f1-4a41-40eb-8a93-e8a795f4475e", "Jonny Bear Goes to the Zoo", 76, 2),
    Content("ca0b63f3-b28a-47d9-a294-9959da15e8e4", "Flashcard Friends Part 3", 77, 2),

    Content("0aa94a0d-0370-4dac-afcb-e53b3dc4ae4d", "Hello, How Are You", 59, 3),
    Content("43e352c0-381e-41f9-93e1-f22f4ee24e3f", "Colors Everywhere!", 60, 3),
    Content("9c8bdd85-1087-414c-829c-bdf0fe2e667b", "Flashcard Friends 1", 61, 3),
    Content("88c8d9ed-1def-4e70-8406-9bc4875e767a", "Crayons Are Fun", 62, 3),
    Content("7310f9fa-b29a-4035-9b7b-443dc16ec792", "Black", 63, 3),
    Content("8f949e3a-9bac-4880-b1fe-234d4855b522", "Marvin Goes to School", 64, 3),
    Content("c524aaf9-ae8c-4a1e-b596-ff34128f5525", "Phonics Funtime E&N", 65, 3),
    Content("aa6dec72-8f3b-4d49-8e76-8e3eaebd27f4", "Count and Shout!", 66, 3),
    Content("90355fa4-dd12-4960-864f-2b993acb27af", "Lineman E", 67, 3),
    Content("d1df65b7-a749-45ee-bcc9-d40496e524c8", "Lineman N", 68, 3),
    Content("4e94d53f-84da-40bd-bd0b-1b91bcd832ec", "Yes, It Is!", 69, 3),
    Content("760b6c76-e4e2-4ee9-accd-8d182c5a792d", "We Love School!", 70, 3),
    Content("c37a09cf-0f13-4aaf-a0ae-318e08d47b97", "Time for a Story", 71, 3),
    Content("3f9b942a-9d4e-4518-9dfd-51c68eb1f6a8", "Flashcard Friends 2", 72, 3),
    Content("ae5e365c-115a-4819-8f53-d7a370add126", "I Like These Things", 73, 3),
    Content("9285127b-520a-4964-844a-f4037395d574", "We Say Please!", 74, 3),
    Content("cc6a245e-5448-44d7-a35d-7638e4ba0056", "My Toy Box", 75, 3),
    Content("dc5e698d-3904-40a0-bddf-cf9806705ea1", "Let's Spin!", 76, 3),
    Content("2f3cfd79-4860-4b2b-b742-506e3ea69013", "Phonics Funtime X", 77, 3),
    Content("514856ff-a166-4fdc-875a-2f7e99a4fe96", "Lineman X", 78, 3),
    Content("9df74db1-e4fd-4436-a76e-03981c46b0ea", "Three", 79, 3),
    Content("65680a71-af4e-4d52-af9d-7347695e099c", "Give it to a Friend!", 80, 3),
    Content("5894d813-3950-4344-8518-9f9011f9828e", "Yes No", 81, 3),
    Content("130c8489-1840-4897-bddf-9f11cec74efd", "Flashcard Friends 3", 82, 3),
    Content("4e12fa80-51d7-4fb1-80ca-6e354808ff7e", "Our Day at School", 83, 3),
    Content("7ffad446-6b58-4662-9139-1473fdca6421", "Jonny Bear Helps His Mother", 84, 3),
    Content("97d9e588-ef5d-49aa-8002-0b5451e3fbf2", "Phonics Funtime C", 85, 3),
    Content("aa89d3a1-8750-4717-8acd-fe85cc104d9b", "Lineman C", 86, 3),

    Content("3fddd33b-f218-4181-91b0-34eb4d7daac4", "The Beehive", 48, 4),
    Content("07a30a48-b1cd-4909-9a19-6e70eb973e09", "Flashcard Friends 1", 49, 4),
    Content("f1b5e1a0-f3c9-4c20-95db-a795f2917e1c", "I See Numbers - Card", 50, 4),
    Content("d6b78ae8-9a05-42a4-b679-819b173356b1", "Ostrich", 51, 4),
    Content("faf5025f-75ef-4b20-bd11-2998354910b6", "Green", 52, 4),
    Content("7f340a90-84bb-4fe5-bf70-00dc22d38012", "Flashcard Friends 2", 53, 4),
    Content("8eb112dc-8336-48d6-85e1-9cb758b9f083", "The Dancing Pig", 54, 4),
    Content("386e3255-3800-4e1e-b4d0-d0ab17ebab53", "The Rabbit Hops", 55, 4),
    Content("33eb898f-70c8-4bd9-8468-c084808f473e", "Little Bitty Spider", 56, 4),
    Content("e5d499ea-9b99-4d51-b3d0-d6de6605de41", "Phonics Funtime O&S", 57, 4),
    Content("0ca24db8-1982-45d7-81e9-29cb6274bf65", "Lineman O", 58, 4),
    Content("2eb62131-4768-47b9-bbd3-6ee3a33f4869", "The Spider's Web", 59, 4),
    Content("d97962e4-202d-4794-ae1b-83eff844d91d", "Bingo", 60, 4),
    Content("74c83169-6245-43fe-8626-ea93cb246014", "Lineman S", 61, 4),
    Content("7c4cd340-0d2a-4b9b-95cc-c9d231a5dcbf", "Farmer and the Carrot", 62, 4),
    Content("ffc698db-ebcc-43ec-839e-7d2461aa59cd", "Old MacDonald's Farm", 63, 4),
    Content("c438deca-0bd2-417e-b932-c5fc8a5a3dc6", "Phonics Funtime H", 64, 4),
    Content("0340476b-6952-4b0a-a629-ffba77cdb1a1", "Yes, I Can!", 65, 4),
    Content("b10a1752-6a44-4a77-93f8-de014a3c92b6", "Horse", 66, 4),
    Content("f83fccc1-6f19-4f05-855b-5663f203c942", "Lineman H", 67, 4),
    Content("428b13f9-f511-48b8-82fc-3f2a0fb9f996", "Four", 68, 4),
    Content("1190b6d5-82d7-41ae-aef2-9e4a7d721153", "Four Little Ducks", 69, 4),
    Content("0677828f-009b-45ee-a102-f6de547226ba", "Flashcard Friends 3", 70, 4),
    Content("598f0a52-0028-41d2-a9c9-00c39015c641", "Sounds on the Farm", 71, 4),
    Content("0d3a901c-c0df-4474-b8fb-ce7849b613e0", "Take a Step", 72, 4),
    Content("3409d946-34c7-4bb3-8fc1-db2af2a73abc", "Jonny Bear Goes to School", 73, 4),
    Content("63628666-2209-4be1-9fb1-3e9e5441aec1", "Phonics Funtime R", 74, 4),
    Content("d022d290-9feb-4423-a9e5-f488c15daac8", "Lineman R", 75, 4),

    Content("88941bc9-2ab5-42e8-99f7-07259928587c", "Two Little Apples", 45, 5),
    Content("1c55d5d9-04f4-4af1-93ce-c189478395bf", "Apples", 46, 5),
    Content("a1611ce2-98dc-436a-b183-401ca423bbad", "Flashcard Friends 1", 47, 5),
    Content("22d9e949-023b-4fd8-8368-a0110578d6a9", "Orange", 48, 5),
    Content("91b1b730-c761-45d2-8bcb-8c513c0733fa", "Party in the Barn", 49, 5),
    Content("007b084e-e194-4ef5-9eb0-745c0c26287c", "I See Numbers - Card", 50, 5),
    Content("677cc542-86b3-4915-88c5-15e126cda47b", "Phonics Funtime A", 51, 5),
    Content("4b496824-5679-4fd5-bc22-7cbd4522b455", "Lineman A", 52, 5),
    Content("152bed56-6505-4360-979f-acd0f35f7685", "Yes, I Am!", 53, 5),
    Content("0ac1fe7b-7bc4-4675-a466-2aab674a3168", "Me, Too!", 54, 5),
    Content("85d70696-e823-49da-885d-fd4f4b209086", "Flashcard Friends 2", 55, 5),
    Content("edacf38d-9620-4228-91dd-f0506193de11", "Pumpkin", 56, 5),
    Content("14bc6d87-0b19-41b7-95ec-d02724c1899d", "Everybody Grows", 57, 5),
    Content("6d561cf1-17a3-4db8-a1e9-dd1847e99e9f", "Great Round Ball", 58, 5),
    Content("567f35a1-0dcc-45bd-a13b-95b529c280ec", "My Watermelon", 59, 5),
    Content("3e93c2b4-ae96-4d71-a6b4-52879865a42e", "Phonics Funtime Q", 60, 5),
    Content("aa712ec2-b1c9-48f3-a9e0-bcaa306d5f06", "Let's Climb", 61, 5),
    Content("4858ca6e-bb83-46ef-b0b2-9073ffc98d8e", "Lineman Q", 62, 5),
    Content("554523ba-11cf-40eb-b58e-f705ac087296", "Five", 63, 5),
    Content("9a86ebf4-f372-49fc-90bc-f395e6baefaa", "Just Like Me!", 64, 5),
    Content("0f95bf5c-427f-4721-a0dd-f95102c17e46", "Flashcard Friends 3", 65, 5),
    Content("4bb0f966-5891-4f1f-9630-7992f4961dd5", "Quiet!", 66, 5),
    Content("ac95bfdc-9f38-40f2-a154-4ac9ea4941cf", "Jack-O'-Lantern", 67, 5),
    Content("e80a14b4-ae7c-4d15-832b-f21818f082ae", "Phonics Funtime W", 68, 5),
    Content("78156c02-327a-4522-ad4b-27713bcbc82e", "This and That", 69, 5),
    Content("4d18d8cb-c338-4cff-845e-42842629cbf1", "Lineman W", 70, 5),
    Content("e3804490-c96a-426e-8642-fb8692b9580f", "You and Me", 71, 5),
    Content("7add72de-d57d-46d5-935c-396b9b6638c1", "Jonny Bear Makes New Friends", 72, 5),

    Content("2fa4ad6b-cbab-4aec-91f2-faba71c017e0", "If You're Happy", 59, 6),
    Content("f92be8c2-5b40-455b-8fb0-c764dd7cb219", "Flash Card Friends 1", 60, 6),
    Content("6c2064d6-ff39-4474-b718-97f21cad0a72", "Yes, I Do!", 61, 6),
    Content("0710509a-9221-444a-aa71-00cd444f3c8c", "Pizza", 62, 6),
    Content("eadf980f-cacd-402a-8d1e-ec69dd5b9ba8", "Sad Sam", 63, 6),
    Content("5155291c-181a-4f32-966a-5d903c440899", "Jam", 64, 6),
    Content("40d5b6b7-7751-4b89-aeba-5a108bf75cf2", "Phonics Funtime J", 65, 6),
    Content("d245d9ea-8339-425e-ac97-7e15adac2261", "Excuse Me!", 66, 6),
    Content("009750b1-f310-484b-b945-72262e822e2d", "Lineman J", 67, 6),
    Content("cf06d73f-b4a5-4c17-b534-f1d1c00dbb74", "Weekends Are Cool", 68, 6),
    Content("c7299c4f-dd37-4c65-92f2-bdb23e6d33c0", "Flash Card Friends 2", 69, 6),
    Content("b02be6f6-933d-4180-8efe-86393909ef28", "Yellow", 70, 6),
    Content("3235054f-3847-4483-8112-940c75a951c6", "Jam, Jam", 71, 6),
    Content("4b566531-643b-494a-8c59-787909608fcd", "Big, Big Turkey", 72, 6),
    Content("d2eb855f-1471-4167-8d5d-2e18b9e543cf", "Phonics Funtime I", 73, 6),
    Content("b431b9ac-01a8-4421-b5b7-ac6365141650", "The Red Hen", 74, 6),
    Content("e4c6f241-cf47-4279-a49e-cb0586bf615e", "Cow, Cow", 75, 6),
    Content("92905178-eb34-4d2d-aebd-5085ddc95702", "Lineman I", 76, 6),
    Content("fe962ee1-aaec-49ad-bc3d-6075c4a2f3d4", "Ice Cream", 77, 6),
    Content("879e268f-512b-45e0-a572-ba9bc3d0961f", "Flash Card Friends 3", 78, 6),
    Content("57e04a80-d876-4314-b5d7-051c5cfa3356", "Laugh!", 79, 6),
    Content("01d96101-6aba-486f-9e70-4827be67c73c", "Be Nice", 80, 6),
    Content("b520942a-40cf-41ef-9840-d32e05aa9115", "Phonics Funtime P", 81, 6),
    Content("63405a68-fd3f-4f24-a2e7-da125f038309", "The Bears' Picnic", 82, 6),
    Content("7735e3ba-90f5-476a-b5f9-bb80cbf2a6d0", "Lineman P", 83, 6),
    Content("fae17eec-15f5-4b0f-b026-fddb7a3519ae", "Six", 84, 6),
    Content("cb99d4ee-3902-4201-ac53-4071908e7953", "Jonny Bear Helps His Father", 85, 6),

    Content("08113660-ec49-487f-a30e-ac46e5f6b311", "The Weather Song", 43, 7),
    Content("7a23bc1d-d5e6-4590-a971-41ff31fa68d9", "Flashcard Friends 1", 44, 7),
    Content("1d317e47-2c3f-4a57-9911-19a7be41cc81", "Morning, Noon, and Night", 45, 7),
    Content("f91c0773-7f25-44c4-b3d9-d2ff2d3c3913", "Yes, I Will!", 46, 7),
    Content("7b1c2b18-e846-47e0-84c7-a58d1548400c", "Toys", 47, 7),
    Content("2be843de-0cc8-4f0e-9d9f-7aa0ed99523b", "Phonics Funtime T", 48, 7),
    Content("aba3c9eb-0125-4c4e-b811-eaad21cb8f70", "Shiver, Shiver, Br-r-r!", 49, 7),
    Content("dea72933-143a-4ad3-b9a4-2c2ab8bd8fed", "Birthday Fun", 50, 7),
    Content("98853cb9-060f-47ae-8f40-94717f16c9f7", "Lineman T", 51, 7),
    Content("a5736264-bda0-4393-b2b7-fc41bf66732e", "Have You Ever Seen a Monkey", 52, 7),
    Content("1f26d587-ca84-445f-9c8b-4ebd7016bc26", "Flashcard Friends 2", 53, 7),
    Content("2efcdab7-8378-4c17-a514-56d58d303391", "White", 54, 7),
    Content("54f1e417-682a-4b64-8900-7beeb9c29d21", "Marvin's Birthday Party", 55, 7),
    Content("9926f0a6-51e8-4acd-9712-36653aca9a66", "My Next Birthday", 56, 7),
    Content("60431c4f-3b86-4ecc-b168-93f46c7b3623", "Phonics Funtime Y", 57, 7),
    Content("a4144b7f-9a53-418c-9746-7427be829fd4", "Tonya Had a Little Lamb", 58, 7),
    Content("6fdc20b3-eb5f-47e9-81fc-b146d969e639", "Lineman Y", 59, 7),
    Content("aff5eb32-f140-4baa-a07a-7aba493ece51", "Yellow Yo-Yo", 60, 7),
    Content("d61ee3ff-2b07-42fb-b0be-d74ecfb56afb", "I Love V", 61, 7),
    Content("02b31506-e496-491a-95ec-1eb0d4e8ec97", "Flashcard Friends 3", 62, 7),
    Content("5b3c19e7-9f83-4cba-8a32-35c4c997348f", "Seven", 63, 7),
    Content("b6553e06-b6b8-41de-ae2e-5c1e3b41adeb", "Fun in the Snow", 64, 7),
    Content("d3b6d7ff-dda3-4a2d-bead-f3ea6b0ac151", "Keep Warm, Please!", 65, 7),
    Content("785de42c-06fe-48f8-9c1d-69ba9d361483", "Phonics Funtime V", 66, 7),
    Content("816a71a3-6108-4f31-a274-6d0d50358576", "Jonny Bear Sees Marvin Monkey", 67, 7),
    Content("47a6938d-d280-44db-ab38-00b3fe9ee639", "Lineman V", 68, 7),

    Content("2f3889a0-c9ba-4286-89e8-ba47c5d4f073", "What Comes After 10", 56, 8),
    Content("f3f5002f-c3cd-4762-baea-13f0af288139", "Do You Know Why", 57, 8),
    Content("4f612b40-dd45-48de-9d55-c4057e5ae3b9", "Flashcard Friends 1", 58, 8),
    Content("d157c41a-3143-4306-9f8a-3c24777981af", "Doctor", 59, 8),
    Content("83aa0f92-86c2-47c9-bbc2-5d11cb80327f", "Too Much Pink!", 60, 8),
    Content("2918be91-8a50-4b17-b56e-a9f8550c06fc", "Flashcard Friends 2", 61, 8),
    Content("19efa7d3-a338-473e-a745-4451979a80be", "Guess Who", 62, 8),
    Content("cc6f025d-3c37-4d3f-9b80-47afea474e74", "Pink", 63, 8),
    Content("cf2357d8-1800-4dea-83b5-306b2e69a459", "Right Now!", 64, 8),
    Content("bbc88ddd-e7dd-4ff2-8ee8-ed377900b4ef", "Flashcard Friends 3", 65, 8),
    Content("d0832b9b-c017-4fbf-8f1e-d921779e3807", "The Firefighters", 66, 8),
    Content("fe9d4294-d62a-4834-b36c-7a89a6dc0674", "Marvin's Friends", 67, 8),
    Content("cd6b9103-a0cb-4e9f-a8b8-7317e4b7155f", "The Mail Carrier's Song", 68, 8),
    Content("f49de419-7d8e-4bda-a203-6d6016a1e58f", "Yes, We Are!", 69, 8),
    Content("ca5a22cb-2794-4689-8a09-b147a02d5dc1", "Quickly", 70, 8),
    Content("dd846393-c211-4ef2-a2fe-1f3bf96cca2d", "All Through the Town", 71, 8),
    Content("890a63b5-47f2-4c5f-bcf9-ef411d935fc3", "Water Play at Gorilla School", 72, 8),
    Content("5bcb2fcd-5f47-4e5c-a789-7244edd55fa0", "Eight", 73, 8),
    Content("20267fb9-3fe5-48e1-af7d-2de6055baeeb", "I Always Like Today!", 74, 8),
    Content("5237af65-b615-4501-8ec2-f92b0ecb219f", "Jonny Bear Likes the Weather", 75, 8),

    Content("0a75c72e-a107-45c9-940a-41006771549e", "Mr. Lineman's Word Warehouse AR", 27, 9),
    Content("e913190e-9d00-4d93-98e8-945129996a0e", "Mr. Lineman's Word Warehouse AY", 28, 9),
    Content("4849cbc1-fa61-433e-a49a-98d0adf9c8d5", "Mr. Lineman's Word Warehouse EA", 29, 9),
    Content("e5cc7cd8-abc9-4fb0-a5b5-f532ecb4d483", "Mr. Lineman's Word Warehouse EE", 30, 9),
    Content("f41d6093-fe10-4b34-af6e-b014eb4b2f2b", "Mr. Lineman's Word Warehouse SH", 31, 9),
    Content("83f94538-4695-4a78-adf0-90ad3a5bde7a", "Mr. Lineman's Word Warehouse TH", 32, 9),
    Content("4ce451d8-c22c-429b-b208-e830941620d7", "Really Good!", 56, 9),
    Content("f21b8b3e-3eec-4183-85eb-fc523597bf8d", "Because!", 57, 9),
    Content("2b8acce1-f42e-4072-9f65-d7bc8c69f4b9", "Phonics ar", 58, 9),
    Content("d6c7561c-5481-4e45-97a3-11240682ef50", "My Vase", 59, 9),
    Content("8b672a3a-502a-4730-83b2-58b00338a318", "Everything Green", 60, 9),
    Content("4f2d1d28-eeda-4262-8778-386fcb4ab9a0", "Flashcard Friends 1", 61, 9),
    Content("47259091-5788-4ffb-bc28-971843d3774d", "The Kitchen", 62, 9),
    Content("b060af5b-f8de-4117-856c-74abf48f973f", "I'm a Little Teapot", 63, 9),
    Content("14b2eb23-3af1-4880-8d75-d402a283cfe6", "Phonics ay", 64, 9),
    Content("394a6612-2055-4f19-8968-d64a1df50a47", "Bigger Than Me", 65, 9),
    Content("ec45ae19-bee5-4724-a7f1-8deaf7bcfce1", "Let's Count 11 to 20", 66, 9),
    Content("0e95f485-aa4d-4bbc-93ec-5ab2fc8706c0", "Flashcard Friends 2", 67, 9),
    Content("dde7760c-3f3e-4b70-b380-a196d55be206", "The Washing Machine", 68, 9),
    Content("e12471c7-c74a-4b4c-a2f0-aa7dafeb9667", "Brown", 69, 9),
    Content("9a0d68ed-f4ee-4af9-a9c5-077f7ddba311", "Phonics ea", 70, 9),
    Content("f9031138-d07f-4a1b-9a66-4c591c9d1e32", "My First Book of Poems", 71, 9),
    Content("e432bfe5-9ede-43d3-8bd1-a9caa6934562", "Happy Face", 72, 9),
    Content("2c86708d-c620-4b51-b97f-87a04fee1916", "Phonics ee", 73, 9),
    Content("8aa76d6a-de4f-4b3f-bcb0-a5e37d278f34", "Flashcard Friends 3", 74, 9),
    Content("a2662956-ec2f-4a8a-b978-f27639577984", "Yes, They Are!", 75, 9),
    Content("5bd5d26c-3540-40a0-b44c-ff732ac14e39", "My Lamp", 76, 9),
    Content("1e76e397-5d13-4561-81e7-6a9389ef5cbb", "Phonics sh", 77, 9),
    Content("ecf97317-e5dd-4aec-a35c-d719dd714f9d", "Twelve Months", 78, 9),
    Content("ad61ad0a-7b43-47bc-adaa-ef80dcea8265", "Oops!", 79, 9),
    Content("a2bbcdd4-d603-4492-936f-18096d483260", "Nine", 80, 9),
    Content("422f3489-787d-49bc-aa33-522924af6451", "Phonics th", 81, 9),
    Content("b52714dc-c36d-498b-82fc-cb67413ae308", "Which One", 82, 9),
    Content("01db2fd2-7812-4ff6-9127-583576204fc7", "I'm the Loudest", 83, 9),
    Content("1c6bddb8-4968-4f6e-a982-686254514e31", "Jonny Bear Rides to School", 84, 9),

    Content("7fb54597-7132-4b03-abdd-ab91eb8d5ee3", "Mr. Lineman's Word Warehouse CH", 31, 10),
    Content("60843f20-fb7c-44d2-bbdc-e9239ede67e5", "Mr. Lineman's Word Warehouse ER", 32, 10),
    Content("af5145f9-83ec-49dc-9e85-05ebd4d10547", "Mr. Lineman's Word Warehouse OO", 33, 10),
    Content("69137be7-4004-41fb-9f1f-00c82d4b6043", "Mr. Lineman's Word Warehouse OU", 34, 10),
    Content("9bd59efd-fbff-4d4d-9cfe-6586da509133", "Mr. Lineman's Word Warehouse OW", 35, 10),
    Content("daa5520f-abe8-40e6-81da-75228775a46d", "Let's Count 21 to 30", 60, 10),
    Content("de450b2b-b532-4edc-99c9-55a0bb2d93e1", "Seven Good Days", 61, 10),
    Content("1a0f4c67-f052-4c61-85e7-84bd450346a5", "Phonics ch", 62, 10),
    Content("9d11d071-aaaa-4393-9745-7a15a2ca9575", "What Is That", 63, 10),
    Content("c489fca1-1186-4ed2-80cf-d0d34704ac62", "The Sun", 64, 10),
    Content("d58583a3-65f5-4836-91e7-7b5fbdcefbf0", "Flashcard Friends 1", 65, 10),
    Content("4d8d1514-8e61-45d4-8486-8d74bd74d8a5", "January to December", 66, 10),
    Content("3f6b3f50-a562-4d8e-86df-69d10813c319", "Betty Bird", 67, 10),
    Content("12d57b8b-866c-40f9-a986-4b324023aa05", "Phonics ck", 68, 10),
    Content("c1f65426-09f9-4c56-948d-36cc796a6d88", "Up to 30", 69, 10),
    Content("7c2a462e-1969-4a7d-b13d-e0525ea61716", "Flashcard Friends 2", 70, 10),
    Content("018dbde7-0c22-4588-8d18-34d8107edc1f", "The Ball Game", 71, 10),
    Content("f71be0d3-d73e-48f1-a9a6-48f515c2d917", "Nest", 72, 10),
    Content("56ed8ddc-afbb-44cb-82cf-5fca2da0603b", "Phonics er", 73, 10),
    Content("3b8680b4-9607-4b1f-a13c-5dcbe512b8dd", "Purple", 74, 10),
    Content("f883dc8e-0fd9-4af7-9825-899d72c85faa", "Playing Catch", 75, 10),
    Content("2091e61b-0e2a-45d2-bda0-260a7c0b02f2", "Going to School", 76, 10),
    Content("1a78b4a9-9b0c-406f-a0d3-285641786c27", "Phonics oo", 77, 10),
    Content("110978ab-7280-4015-a35f-23bf606db943", "Flashcard Friends 3", 78, 10),
    Content("9003900e-0abd-40c7-b905-3a52928b796d", "Three Eggs", 79, 10),
    Content("4aa150ca-a6e2-4cc3-a87a-706e6fbe5b85", "Fun and Balloons", 80, 10),
    Content("ea00e36c-5059-4d3f-aab1-97b961db709c", "Funny Shapes", 81, 10),
    Content("3c388ea9-8628-4306-b7b3-c5515e751d66", "Phonics ou", 82, 10),
    Content("fd46afcf-3192-4c6b-ab89-8bdd32b279fc", "Whose Is It", 83, 10),
    Content("a21d0723-ec92-4f47-8d6d-2c60dc4103ff", "Mr. Lineman's Word Warehouse CK", 84, 10),
    Content("aa0c9d4c-c3c6-433d-a0e8-9dd43e262f1c", "Rude, Rude Kitty", 85, 10),
    Content("3461317f-4be7-4250-ad54-40685b5a2785", "Phonics ow", 86, 10),
    Content("e8a98816-dc04-4fb9-9a0e-9496ba0a81ef", "Ten", 87, 10),
    Content("6bc96bfd-4127-4bcf-bf88-4c0c76d92be9", "What Time Is It", 88, 10),
    Content("cc36baed-21f9-461a-b63d-af66e5242bfb", "Jonny Bear Paints with Marvin", 89, 10),

    )

fun getMedia(base: String, item: Content): String {
    val listFiles = File(base + "${File.separator}.contents${File.separator}" + item.id).listFiles()
    if (listFiles.isNullOrEmpty()){
        println(item)
    }
    return listFiles.filter {
        it.name.endsWith("mp3") || it.name.endsWith("mp4")
    }.first().absolutePath
}

fun buildTarget(base: String, item: Content, type: String): String {
    return base + "${File.separator}Unit${item.unit}${File.separator}${item.sequence}-${item.name}$type"
}

fun copyFile(sourceFilePath: String, destinationFilePath: String) {
    try {
        val sourceFile = File(sourceFilePath)
        if (!sourceFile.exists()) {
            println("源文件不存在: $sourceFilePath")
            return
        }

        val destinationFile = File(destinationFilePath)

        if (destinationFile.exists() && sourceFile.length() == destinationFile.length()){
            return
        }
        val destinationDirectory = destinationFile.parentFile
        if (!destinationDirectory.exists()) {
            if (!destinationDirectory.mkdirs()) {
                println("无法创建目标文件夹: ${destinationDirectory.absolutePath}")
                return
            }
        }

        FileInputStream(sourceFile).use { inputStream ->
            FileOutputStream(destinationFile).use { outputStream ->
                val buffer = ByteArray(4096)
                var bytesRead: Int
                while (inputStream.read(buffer).also { bytesRead = it } != -1) {
                    outputStream.write(buffer, 0, bytesRead)
                }
            }
        }
        println("文件复制成功: $sourceFilePath 到 $destinationFilePath")
    } catch (e: IOException) {
        println("文件复制过程中出现错误: ${e.message}")
        throw e
    }
}

fun main() {

    val baseDir = "f:\\files"
    val targetDir = "d:\\putaozi"

    resources.forEach {
        val sourceFile = getMedia(baseDir, it)
        val targetFile = buildTarget(targetDir, it, sourceFile.substring(sourceFile.lastIndexOf(".")))
        copyFile(sourceFile, targetFile)
    }

}


data class Content(val id: String, val name: String, val sequence: Int, val unit: Int)