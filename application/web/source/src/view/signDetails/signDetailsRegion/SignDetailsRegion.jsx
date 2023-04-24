import React from 'react'

function SignDetailsRegion({oneSignDetails}) {
  return (
    <div>
         <li id='sign-name'>{oneSignDetails.name}</li>
         <li id='sign-description'>{oneSignDetails.description}</li>
         <li id='sign-start-date sign-end-date'>{oneSignDetails.startDate}-{oneSignDetails.endDate}</li>
         <li id='sign-tarot-card'>{oneSignDetails.tarotCard}</li>
         <li id='sign-element'>{oneSignDetails.element}</li>
         <li id='sign-ruling-planet'>{oneSignDetails.rulingPlanet}</li>
         <li id='sign-ruling-house'>{oneSignDetails.rulingHouse}</li>
         <li id='sign-color'>{oneSignDetails.color}</li>
         <li id='sign-sister-sign'>{oneSignDetails.sisterSign}</li>
         <li id='sign-modality'>{oneSignDetails.modality}</li>
    </div>
  )
}

export default SignDetailsRegion